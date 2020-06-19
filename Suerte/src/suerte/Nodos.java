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
public class Nodos<T> {
    public Nodos ant;
    public Nodos sig;
    private int tipo;
    private T data;
    
    public Nodos(T data, int tipo){
        this.tipo = tipo;
        this.data = data;
        ant = null;
        sig = null;
    }
    
    public T ObtenerData(){
        return data;
    }
    
    public void AsignarData(T data){
        this.data = data;
    }
    
    public String toString(){
        return ""+data;
    }
    
    public int ObtenerTipo(){
        return tipo;
    }
}
