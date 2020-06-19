/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author Miguel Angel
 */
public class Nodo {
    public Nodo Izq;
    public Nodo Der;
    public int data;
    
    public Nodo(int data) {
        this.data=data;
	Izq=null;
        Der=null;
    }
    
    public int ObtenerData() {
        return data;
    }
    
    public void AsignarData(int data) {
        this.data=data;
    }
    
    public String toString() {
	return ""+ data;
    }
}
