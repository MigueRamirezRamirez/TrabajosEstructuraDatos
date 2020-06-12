/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcnotacionpolaca;

/**
 *
 * @author Miguel Angel
 */
public class ColaCircInt {
    private int vuelta[];
    private int frente;
    private int sig;
    
    public ColaCircInt(int x) {
	vuelta=new int[x];
        sig=0;
	frente=-1;
    }
  
    public boolean ColaLLena() {
        if((sig==vuelta.length)) {
            return true;
	}else {
            return false;
	}
    }
    
    public void Colar(int Num) throws ExcepColaCircLlena{
        if(ColaVacia()&(Espacio()==true)) {
            System.out.println("//Reset");
            frente=-1;
            sig=0;
	}
        if(ColaLLena()) {
            throw new ExcepColaCircLlena();
	}	 
        vuelta[sig]=Num;
	sig++;
	if(sig==1) {
            frente=0;
	}
    }
    
    public boolean ColaVacia() {
        if(frente==sig) {
            return true;
        }else if(frente==-1) {
            return true;
	}else {
            return false;
	}
    }
    
    public int Out() throws ExcepColaCircVacia {
	if(ColaVacia()) {
            throw new ExcepColaCircVacia();
        }
        int valor=vuelta[frente];
	frente++;
	return valor;
    }
    
    public boolean Espacio() { 
    //poscion vacia frente
        int PosicionesVaciasFrente;
        PosicionesVaciasFrente=((frente+1)%vuelta.length);
        if(PosicionesVaciasFrente>0) {
            return true;
        }else {
            return false;
        }
    }
    
    public int Obtnerfrent() {
	return frente;
    }
}
