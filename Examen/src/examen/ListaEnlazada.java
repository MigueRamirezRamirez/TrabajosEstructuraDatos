/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Miguel Angel
 */
public class ListaEnlazada {
    
    private NodosExamen Inicio;
    private NodosExamen Fin;
    private int SinElementos;

    public ListaEnlazada(){
        Inicio = null;
        Fin = null;
        SinElementos = 0;
    }

    public int getNoElementos() {
        return SinElementos;
    }

    public void AgregacionInical (NodosExamen Agregacion){
        if(Inicio == null){
            Inicio = Agregacion;
            Fin = Agregacion;
            SinElementos++;
        }else {
            Agregacion.Sig = Inicio;
            Inicio = Agregacion;
            SinElementos++;
        }
    }

    public void AgregacionFinal (NodosExamen Agregacion){
        if(Fin == null){
            Fin = Agregacion;
            Inicio = Agregacion;
            SinElementos++;
        }else {
            Fin.Sig = Agregacion;
            Fin = Agregacion;
            SinElementos++;
        }
    }

    public boolean Buscar (NodosExamen Busqueda){
        if (Busqueda != null){
            NodosExamen ref = Inicio;
            boolean Encontrado = false;
            while ((ref != null) && !Encontrado){
                if(ref.getData() == Busqueda.getData()){
                    Encontrado = true;
                }
                ref = ref.Sig;
            }
            return Encontrado;
        }
        return false;
    }

    public NodosExamen EliminacionInicial(){
        if(Inicio == null){
            return null;
        }else {
            NodosExamen Ret = Inicio;
            Inicio = Inicio.Sig;
            Ret.Sig = null;
            SinElementos--;
            return Ret;
        }
    }

    public NodosExamen EliminacionFinal(){
        if(Fin == null){
            return null;
        }else {
            NodosExamen ref = Inicio;
            boolean Find = false;
            while ((ref != null) && !Find){
                if(ref.Sig == Fin){
                    Find = true;
                }
                if(!Find){
                    ref = ref.Sig;
                }
            }
            SinElementos--;
            NodosExamen eliminar = Fin;
            Fin = ref;
            ref.Sig = null;
            return eliminar;
        }
    }

    public NodosExamen EliminaroPrNodo(NodosExamen a){
        if(a == null){
            return null;
        }
        if(Fin == null){
            return null;
        }else {
            NodosExamen refRojo = Inicio;
            NodosExamen refAzul = null;
            NodosExamen refElim = null;
            boolean Find = false;
            while ((refRojo != null) && !Find){
                if(refRojo.getData() == a.getData()){
                    Find = true;
                    refElim = refRojo;
                    SinElementos--;
                }
                if(!Find){
                    refAzul = refRojo;
                    refRojo = refRojo.Sig;
                }else {
                    refAzul.Sig = refRojo.Sig;
                    refElim.Sig = null;
                }
            }
            return refElim;
        }
    }

    public NodosExamen PorIndice (int p){
        if(Inicio == null){
            return null;
        }
        if (p >= SinElementos){
            return null;
        }
        if (p < 0){
            return null;
        }
        int i = 0;
        NodosExamen ref = Inicio;
        for (; i< p; i++){
            ref = ref.Sig;
        }
        ref = new NodosExamen(null, ref.getData());
        return ref;
    }
}
