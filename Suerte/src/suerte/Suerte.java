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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Suerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        
        ListaDoble l = new ListaDoble();
        boolean coin=false;
	boolean pN=true;
	int n=0,ne=0;
	int cont=4;
	String resp="";
        
        do{
            System.out.println("Ingrese un numero entero:");
	    n=Integer.parseInt(entrada.readLine());
	    l.AgregacionInical(new Nodos<Integer>(n,1));
	    if(pN){
                for(int i=0;i<4;i++){
	            System.out.println("Ingresa otro numero entero:");
	            n=Integer.parseInt(entrada.readLine());
	            l.AgregacionInical(new Nodos<Integer>(n,1));
	        }
	        pN=false;
	    }
	    cont++;
	    System.out.println("Quieres agregar otro numero? Y/N");
	    resp=entrada.readLine(); 
	}while(resp.compareToIgnoreCase("Y")==0);
	System.out.println("Tus numeros:");
	System.out.println(l.toStringReverse());
	System.out.println(l);      
	ne = (l.getNoElementos())-1;
	for(int j=0;j<ne;j++){
            coin = r.nextBoolean();
	    if(coin==true){
	        Nodos Eliminado =l.EliminacionInicial();
	    }
	    if(coin==false){
	        Nodos Eliminado =l.EliminacionFinal();      
	    }
	}
	System.out.println("Se lanzo la moneda "+ cont +" veces");
	System.out.println("El numero de la suerte: "+ l);    
    }
}
