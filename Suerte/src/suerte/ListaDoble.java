/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suerte;

/**
 *
 * @author Miguel Angel
 */
public class ListaDoble {
    private Nodos Inicio;
    private Nodos Fin;
    private int SinElementos;
    
    public ListaDoble(){
        Inicio=null;
        Fin=null;
        SinElementos=0;
    }
    
    public int getNoElementos(){
        return SinElementos;
    }
    
    public void AgregacionInical(Nodos Agregacion){
        if(Inicio == null){
            Inicio=Agregacion;
            Fin=Agregacion;
            SinElementos++;
        } else {
            Agregacion.sig=Inicio;
            Inicio.ant=Agregacion;
            Inicio=Agregacion;
            SinElementos++;
        }    
    }
    
    public void AgregacionFinal(Nodos Agregacion){
        if(Fin == null){
            Fin = Agregacion;
            Inicio = Agregacion;
            SinElementos++;
        } else {
            Fin.sig=Agregacion;
            Agregacion.ant = Fin;
            Fin=Agregacion;
            SinElementos++;
        }
    }
    
    public boolean Buscar(Nodos Busqueda){
        if(Busqueda != null){
            if(Inicio !=null){
                if(Inicio.ObtenerData() == Busqueda.ObtenerData()){
                    return true;
                }
            }
            if(Fin !=null){
                if(Inicio.ObtenerData() == Busqueda.ObtenerData()){
                    return true;
                }
            }
            Nodos Refer = Inicio;
            boolean Encontrado = false;
            while((Refer != null) && !Encontrado){
                if(Refer.ObtenerData() == Busqueda.ObtenerData()){
                    Encontrado = true;
                }
                Refer = Refer.sig; 
            }
            return Encontrado;
        }
        return false;
    }
    
    public Nodos EliminacionInicial(){
        if(Inicio == null){
            return null;
        }else{
            Nodos Ret = Inicio;
            Inicio = Inicio.sig;
            Inicio.ant = null;      
            Ret.sig = null;
            Ret.ant = null;
            SinElementos--;
            return Ret;
        }        
    }
    
     public Nodos EliminacionFinal(){
        if(Fin == null){
            return null;
        }else{       
            Nodos Eliminar = Fin;
            Fin = Fin.ant;
            Fin.sig = null;
            Eliminar.sig = null;
            Eliminar.ant = null;         
            SinElementos--;
            return Eliminar;
        }
     }
     
     public Nodos EliminaroPrNodo(Nodos a){
        if(a == null){
           return null; 
        } 
        if(Fin == null){
            return null;
        }else{
            ///////////////////////////
            if(Inicio.ObtenerData()== a.ObtenerData()){
                return this.EliminacionInicial();
            }
            ///////////////////////////
            if(Fin.ObtenerData()== a.ObtenerData()){
                return this.EliminacionFinal();
            }
            ///////////////////////////
            Nodos refRojo = Inicio;
            Nodos refAzul = null;
            Nodos refElim = null;
            boolean Encontrado = false;
            while((refRojo != null)&& !Encontrado){
                if(refRojo.ObtenerData() == a.ObtenerData()){
                    Encontrado = true; 
                    refElim = refRojo;
                    SinElementos--;
                }
                refRojo = refRojo.sig;
            }
            if(Encontrado){
                refRojo = refElim.ant;
                refAzul = refElim.sig;
                refRojo.sig = refAzul;
                refAzul.ant = refRojo;
                refElim.sig = null;
                refElim.ant = null;  
            }
            return refElim;
        }        
    }
     
    public Nodos PorIndice(int p){
        if(Inicio == null){
            return null;
        }
        if(p>= SinElementos){
            return null;
        }
        if(p<0){
            return null;
        }
        int i=0;
        Nodos Refer = Inicio;
        for(;i<p; i++){
            Refer = Refer.sig; 
        }
        switch(Refer.ObtenerTipo()){
            case 1:
                Refer = new Nodos<Integer>((int)Refer.ObtenerData(),1);
                break;
            case 2:
                Refer = new Nodos<Double>((double)Refer.ObtenerData(),2);
                break;
            case 3:
                Refer = new Nodos<String>((String)Refer.ObtenerData(),3);
                break;
            case 4:
                Refer = new Nodos<Float>((float)Refer.ObtenerData(),4);
                break;
            case 5:
                Refer = new Nodos<Boolean>((boolean)Refer.ObtenerData(),5);
                break;
            case 6:
                Refer = new Nodos<Character>((char)Refer.ObtenerData(),6);
                break;
            case 7:
                Refer = new Nodos<Short>((short)Refer.ObtenerData(),7);
                break;
            case 8:
                Refer = new Nodos<Long>((long)Refer.ObtenerData(),8);
                break;
            default:
                break;
        }
        return Refer;
    }
    
    public String toString(){
        String toS = "";
        if(Inicio == null){
            return "";
        }
        Nodos Refer = Inicio;
        while(Refer != null){
            toS = toS + " " +Refer.toString();
            Refer = Refer.sig;
        }
        return toS;
    }
    
    public String toStringReverse(){
        String toSR = "";
        if(Fin == null){
            return "";
        }
        Nodos Refer = Fin;
        while(Refer != null){
            toSR = toSR + " " +Refer.toString();
            Refer = Refer.ant;
        }
        return toSR;
    }
}