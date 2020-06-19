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
public class TestColaGenerica {
    public static void main(String[]args) {
	ColaGen<Integer>colaInt=new ColaGen<>(3);
        System.out.println("~~~Cola Entera~~~"); 
	try {
            colaInt.Encolar(100);
            colaInt.Encolar(243);
            int x=colaInt.Sacar();
            System.out.println("Sacamos "+x);
            x=colaInt.Sacar();
            System.out.println("Sacamos "+x);
            System.out.println("Agregar 10");
            colaInt.Encolar(10);
	}catch(ExcepColaLlena Err) {
            System.out.println(Err.getMessage());
	}catch(ExcepColaVacia Err) {
            System.out.println(Err.getMessage());
	}
	
	ColaGen<Double>colaDoble=new ColaGen<>(3);
        System.out.println("~~~Cola Doble~~~"); 
	try {
            colaDoble.Encolar(1.34);
            colaDoble.Encolar(2.56);
            
            double y=colaDoble.Sacar();
            System.out.println("Sacamos "+y);
            y=colaDoble.Sacar();
            System.out.println("Sacamos "+y);
            System.out.println("Agregar 10.4567");
            colaDoble.Encolar(10.4567);
	}catch(ExcepColaLlena Err) {
            System.out.println(Err.getMessage());
        }catch(ExcepColaVacia Err) {
            System.out.println(Err.getMessage());
	}
	
	ColaGen<String>colaCadena=new ColaGen<>(3);
        System.out.println("~~~Cola Cadena~~~"); 
	try {
            colaCadena.Encolar("Migue");
            colaCadena.Encolar("Angel");
            String S=colaCadena.Sacar();
            System.out.println("Sacamos "+S);
            S=colaCadena.Sacar();
            System.out.println("Sacamos "+S);
            System.out.println("Agregar Ramirez");
            colaCadena.Encolar("Ramirez");
	}catch(ExcepColaLlena Err) {
            System.out.println(Err.getMessage());
        }catch(ExcepColaVacia Err) {
            System.out.println(Err.getMessage());
	}
	
	ColaGen<Estudiantes>colaEstud=new ColaGen<>(3);
        System.out.println("~~~Cola Estudiante~~~");
	try {
            Estudiantes e1,e2;
            e1=new Estudiantes("Gonzalo","18590243");
            e2=new Estudiantes("Alejandro","18590254");
            colaEstud.Encolar(e1);
            colaEstud.Encolar(e2);
            Estudiantes e=colaEstud.Sacar();
            System.out.println("Sacamos al Estudiante 1 ");
            e=colaEstud.Sacar();
            System.out.println("Sacamos al Estudiante 2 ");
            System.out.println("Agregar otro estudiante");
            Estudiantes e3=new Estudiantes("Eduardo","18590523");
            colaEstud.Encolar(e3);
		}catch(ExcepColaLlena Err) {
			System.out.println(Err.getMessage());
		}catch(ExcepColaVacia Err) {
			System.out.println(Err.getMessage());
		}
	}
}
