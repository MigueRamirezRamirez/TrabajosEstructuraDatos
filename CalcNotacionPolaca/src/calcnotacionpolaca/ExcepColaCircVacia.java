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
public class ExcepColaCircVacia extends Exception {
    public ExcepColaCircVacia() {
	super("La cola ya esta Vacia");
    }
}

