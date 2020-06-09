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
public class PilaExamen {
    private ListaEnlazada Esq;

    public PilaExamen(){
        Esq = new ListaEnlazada();
    }

    public void ApilacionP(int n) throws DesbP{
        Esq.AgregacionInical(new NodosExamen(null,n));
    }

    public NodosExamen SacarP() throws SubDesbP{
        NodosExamen esacar = Esq.EliminacionInicial();
        return esacar;
    }
}
