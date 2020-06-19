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
public class Arbolito {
    private Nodo raiz;
    public Arbolito() {
	raiz=null;
    }
 
    private void InstertDesde(Nodo nodito, Nodo desde) {
        if(desde.ObtenerData()==nodito.ObtenerData()) {
	return;
    }
        
    if(nodito.ObtenerData()> desde.ObtenerData()) {
        if(desde.Der==null) {
            desde.Der=nodito;
            return;
	} else {
            InstertDesde(nodito, desde.Der);
            return;
	}
    } else {
        if(desde.Izq==null){
	desde.Izq=nodito;
	return;
        } else {
            InstertDesde(nodito,desde.Izq);
            return;
            }
        }
    }
    public void insert(Nodo nodito) {
	if(raiz==null){
            raiz=nodito;
            return;//termina el metodo
	}
        InstertDesde(nodito,raiz);
    }
    
    public boolean buscar(Nodo nodito) {
        return buscarDesde(nodito, raiz);
    }
    
    private boolean buscarDesde(Nodo nodito, Nodo desde) {
    if(desde==null) {
        return false;
    }
    if(desde.ObtenerData()==nodito.ObtenerData()) {
        return true;
    }
    if(nodito.ObtenerData()>desde.ObtenerData()) {
        return buscarDesde(nodito, desde.Der);
    } else {
    return buscarDesde(nodito, desde.Izq);
    }
  }
}
