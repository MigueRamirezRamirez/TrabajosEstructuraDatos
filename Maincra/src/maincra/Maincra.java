/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincra;

/**
 *
 * @author Miguel Angel
 */
import java.util.Random;
public class Maincra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SinElementos {
        // TODO code application logic here
        //herramientas
	boolean Mesa=false;
	boolean Barco=false;
	boolean Baston=false;
	boolean Cana_p=false;
	boolean Cuerda=false;
	//crear una variable aleatoria para definir los materiales
	int tipAl=0;//Tipo Aleatorio
	int al=0;//aleatorio
	//MATERIALES
	  Materiales<Integer> Hilo = new Materiales<>(4);
	  Materiales<Integer> Resina = new Materiales<>(1);
	  Materiales<Integer> Madera = new Materiales<>(5);
	 
	  int VarTM=0;
	boolean ResinaC=false;
	//--------------Empieza el juego-----------------
	for(int x=0;x<30;x++) {
		//Definir el tipo de material
		VarTM=(int)(Math.random()*(2-(-1)));
		//se define lo que se va apilar (Numero aleatorio)
		al=(int)(Math.random()*(10-1));
		//MADERA
		if(VarTM==0) { 
			  try {
				  Madera.apilar(al);
				  if((Madera.cantidad()==4)&(Mesa==false)) {  
					  Mesa=true;
					  System.out.println("Mesa desbloqueado!");
					  //vaciar la pila
					  Madera.vaciarComple();  
				  }if((Madera.cantidad()==2)&(Baston==false)&(Mesa)) {
					  Baston=true;
					  System.out.println("Baston desbloqueado!");
					//vaciar la pila
					  Madera.vaciarComple(); 
				  }
			  }catch(Desb E) {
				  System.out.println(E.getMessage()+" Madera esta completa!");
				  if((Barco==false)&(Mesa)&(Baston)&(Cuerda)&(Cana_p)) {
					  Barco=true;
					  System.out.println("Barco desbloqueado!");
					  //Vaciar la pila
					  Madera.vaciarComple();
					  System.exit(0);
				  }
			  }
			  //RESINA
		}if(VarTM==1) {
			  try {
			 Resina.apilar(al);
		   }catch(Desb E) {
			  System.out.println(E.getMessage()+" Resina esta Completa!");
			 //condicion aquí
		       if(ResinaC==false) {
			    ResinaC=true;
			    //Vaciar pila de Resina
			     Resina.vaciarComple();
			     }
			   }  
		 }//HILO
		  if(VarTM==2){
			  try {
			  Hilo.apilar(al);
		    }catch(Desb E) {
			  System.out.println(E.getMessage()+" Hilo esta completa!");
			  if((Cuerda==false)&(Mesa)&(ResinaC)&(Baston)) { //solo que aquí no evaluamos la cantidad que hay en la pila ya que esta desbordada
				  Cuerda=true;
				  System.out.println("Cuerda desbloqueada!");
				  //vaciar la Pila de Hilo
				  Hilo.vaciarComple();
			    }
				 //inmediatamente comparar si se cumple lo necesario para la caña
			   if((Cana_p==false)&(Mesa)&(Baston)&(Cuerda)) {
		    	  Cana_p=true;
		    	  System.out.println("Caña de pescar desbloqueada!");
			     }
		      }
		    }   
	    }
    }
    
}
