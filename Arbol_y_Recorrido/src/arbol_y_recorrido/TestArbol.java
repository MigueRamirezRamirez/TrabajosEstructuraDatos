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
public class TestArbol {
    public static void main(String[] args) {
        Arbolito Oak=new Arbolito();
	Oak.insert(new Nodo(10));
	if(Oak.Buscar(new Nodo(10))){
            System.out.println("Se encontro el 10");
        }
	Nodo arb;
	arb= new Nodo(0);
        if(Oak.Buscar(arb)){
            System.out.println("Se encontro el "+arb);
	} else {
            System.out.println("No se encontro el "+arb);	
	}
	arb= new Nodo(5);
	Oak.insert(arb);
	if(Oak.Buscar(arb)){
            System.out.println("Se encontro el "+arb);
	} else {
            System.out.println("No se encontro el "+arb);	
	}
        arb= new Nodo(15);
	Oak.insert(arb);
	if(Oak.Buscar(arb)){
	    System.out.println("Se encontro el "+arb);
	} else {
            System.out.println("No se encontro el "+arb);	
	}
	arb= new Nodo(4);
	Oak.insert(arb);
	if(Oak.Buscar(arb)){
            System.out.println("Se encontro el "+arb);
	} else {
            System.out.println("No se encontro el "+arb);
	}
        arb= new Nodo(16);
	Oak.insert(arb);
	if(Oak.Buscar(arb)){
            System.out.println("Se encontro el "+arb);
	} else {
            System.out.println("No se encontro el "+arb);
	}
	arb= new Nodo(8);
	Oak.insert(arb);
	if(Oak.Buscar(arb)){
	System.out.println("Se encontro el "+arb);
	} else {
            System.out.println("No se encontro el "+arb);
	}
        arb= new Nodo(11);
	Oak.insert(arb);
	if(Oak.Buscar(arb)){
	System.out.println("Se encontro el "+arb);
	} else {
            System.out.println("No se encontro el "+arb);
	}
	arb= new Nodo(1111);
	if(Oak.Buscar(arb)){
	System.out.println("Se encontro el "+arb);
	} else {
            System.out.println("No se encontro el "+arb);
	}
	System.out.println("~~~Recorrido~~~");
	System.out.println("Pre-Order(VID) :");
	System.out.println(Oak.toStringPreOrder());
	System.out.println("In-Order(IVD) :");
	System.out.println(Oak.toStringInOrder());
	System.out.println("Post-Order(IDV) :");
	System.out.println(Oak.toStringPostOrder());	
	}
}