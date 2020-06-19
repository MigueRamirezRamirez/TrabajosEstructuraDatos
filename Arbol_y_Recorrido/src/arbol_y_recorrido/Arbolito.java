/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_y_recorrido;

/**
 *
 * @author Miguel Angel
 */
public class Arbolito {
    private Nodo raiz;
	private String Recorrido;
	public Arbolito() {
            raiz=null;
            Recorrido="";
	}
        
	private void InsercionDesde(Nodo nodito, Nodo desde) {
            if(desde.ObtenerData()==nodito.ObtenerData()) {
            return;
            }
            if(nodito.ObtenerData()> desde.ObtenerData()) {
                if(desde.Der==null) {
                    desde.Der=nodito;
                    return;
		} else {			
                    InsercionDesde(nodito, desde.Der);
                    return;
		}
            } else {
		if(desde.Izq==null){
                    desde.Izq=nodito;
                    return;
                } else {
                    InsercionDesde(nodito,desde.Izq);
                    return;
		}
            }
	}
	
	public void insert(Nodo nodito) {
            if(raiz==null){
                raiz=nodito;
                return;
            }
            InsercionDesde(nodito,raiz);
	}
        
	public boolean Buscar(Nodo nodito) {
		return BusquedaDesde(nodito, raiz);
	}
        
	private boolean BusquedaDesde(Nodo nodito, Nodo desde) {
            if(desde==null) {
            return false;
            }
            if(desde.ObtenerData()==nodito.ObtenerData()) {
                return true;
            }
            if(nodito.ObtenerData()>desde.ObtenerData()) {
                return BusquedaDesde(nodito, desde.Der);
            } else {
                return BusquedaDesde(nodito, desde.Izq);
            }
	}
	
	//Recorrido Pre-Orden
	public String toStringPreOrder() {
            Recorrido= "";
            PreOrdenDesde(raiz);
            return Recorrido;
	}
	
	private void PreOrdenDesde(Nodo desde) {
            if(desde==null) {
                return;
            }
            Recorrido=Recorrido+" "+desde;
            PreOrdenDesde(desde.Izq);
            PreOrdenDesde(desde.Der);	
	}
	
	public String toStringInOrder() {
		Recorrido= "";
		InOrderDesde(raiz);
		return Recorrido;
	}
        
	private void InOrderDesde(Nodo desde) {
            if(desde==null) {
                return;
            }
            InOrderDesde(desde.Izq);
            Recorrido=Recorrido+" "+desde;
            InOrderDesde(desde.Der);	
	}
        
	public String toStringPostOrder() {
            Recorrido= "";
            PostOrderDesde(raiz);
            return Recorrido;
	}
	
	private void PostOrderDesde(Nodo desde) {
            if(desde==null) {
                return;
            }
            PostOrderDesde(desde.Izq);
            PostOrderDesde(desde.Der);
            Recorrido=Recorrido+" "+desde;
	}
}
