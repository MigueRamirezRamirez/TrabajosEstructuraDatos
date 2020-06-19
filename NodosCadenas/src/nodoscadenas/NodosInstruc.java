/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodoscadenas;

/**
 *
 * @author Miguel Angel
 */
public class NodosInstruc {
    public NodosInstruc sig;
    private String data;
    NodosInstruc Sig;
    public NodosInstruc(NodosInstruc Sig,String Data) {
        this.sig=Sig;
        this.data=Data;
    }
    
    public String ObtenerData() {
        return data;
    }
    
    public void ColocarData(String Data) {
        this.data=Data;
    }
    
    public String toString() {
        return "Tu palabra: "+data;
    }
}
