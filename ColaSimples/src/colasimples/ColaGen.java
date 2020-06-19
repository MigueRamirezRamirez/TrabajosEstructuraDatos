/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasimples;

/**
 *
 * @author Miguel Angel
 */
public class ColaGen<T> {
    private T Esq[];
    private int Frent;
    private int Sig;
    @SuppressWarnings("unchecked")
    
    public ColaGen(int x) {
	Esq=(T[])new Object[x];
	Sig=0;
	Frent=-1;
    }
    
    public boolean colaLLena() {
        if(Sig==Esq.length) {
            return true;
	} else {
            return false;
	}
    }
    
    public void Encolar(T x) throws ExcepColaLlena{
        if(ColaVacia()) {
            System.out.println("//Reset");
            Frent=-1;
            Sig=0;
	}
	if(colaLLena()) {
            throw new ExcepColaLlena();
	}
	Esq[Sig]=x;
	Sig++;
	if(Sig==1) {
            Frent=0;
	}
    }
    
    public boolean ColaVacia() {
        if(Frent==Sig) {
            return true;
	} else if(Frent==-1) {
            return true;
	} else {
            return false;
	}
    }
    
    public T Sacar() throws ExcepColaVacia {
	if(ColaVacia()) {
            throw new ExcepColaVacia();
	}
	T Valor=Esq[Frent];
	Frent++;
	return Valor;
    }
}
