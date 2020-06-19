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
public class ExcepColaLlena extends Exception {
    public ExcepColaLlena() {
	super("La Cola ya esta llena");
    }
}
