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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NodosCadenas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader leer=new InputStreamReader(System.in);
	BufferedReader entrada=new BufferedReader(leer);
        
        String pal="";
	String resp="";
        
        NodosInstruc Ini=null;
	NodosInstruc Sig=null;
	NodosInstruc Cont=null;
        
        do{
            System.out.println("Ingresa cualquier palabra");
            pal=entrada.readLine();
            if(Ini==null) {
                Ini=new NodosInstruc(null,pal);
		Cont=Ini;
            } else {
                Sig=new NodosInstruc(null, pal);
		Cont.Sig=Sig;
		Cont=Sig;
            }
            System.out.println("Quieres agregar una más? Y/N");
            resp=entrada.readLine();     
        }while(resp.compareToIgnoreCase("Y")==0);
        NodosInstruc Refer=Ini;
        while(Refer!=null) {
            System.out.println(Refer);
            Refer=Refer.Sig;
        }
    }
}
