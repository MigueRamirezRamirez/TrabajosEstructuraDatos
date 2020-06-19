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
public class ColaInt {
    private int Esq[];
    private int Frent;
    private int Sig;
    
    public ColaInt(int x) {
        Esq=new int[x];
        Sig=0;
	Frent=-1;
    }
    
    public boolean ColaLlena() {
        if(Sig==Esq.length) {
            return true;
        }else {
            return false;
	}
    }
    
    public void Encolar(int x) throws ExcepColaLlena { 
        if(ColaVacia()) {
            System.out.println("//Reset");
            Frent=-1;
            Sig=0;
	}
	if(ColaLlena()) {
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
    
    public int Sacar() throws ExcepColaVacia {
	if(ColaVacia()) {
            throw new ExcepColaVacia();
	}
	int valor=Esq[Frent];
	Frent++;
	return valor;
    }
}
