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
public class TestColaInt {
    public static void main(String[]args) {
	int n=0;
	ColaInt colaInt=new ColaInt(6);
	try {
            colaInt.Encolar(58);
            colaInt.Encolar(60);
            System.out.println("Agregar 40");
            colaInt.Encolar(40);
            n=colaInt.Sacar();
            System.out.println("Sacamos "+n);
            n=colaInt.Sacar();
            System.out.println("Sacamos "+n);
            System.out.println("Agregar 64");
            colaInt.Encolar(64);
	}catch(ExcepColaLlena Err) {
            System.out.println(Err.getMessage());
	}catch(ExcepColaVacia Err) {
            System.out.println(Err.getMessage());
        }
    }
}