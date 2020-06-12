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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcNotacionPolaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	int op=0;
	int op1=0,op2=0,op3=0,op4=0,op5=0;
	String x="";
	ColaCircInt cola=new ColaCircInt(5);
        do {
	System.out.println("Que operacion quiers realizar:\n1)Suma\n2)Resta\n3)Multipliacion\n4)Division" );
	op=Integer.parseInt(teclado.readLine());
            if (op<=0 || op>=5) {
                System.out.println("Ingresa un opcion valida!");
            }
        }while (op<=0 || op>=5);
	try{
            System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
            System.out.println("Escribe el Operando 1:");
            op1=Integer.parseInt(teclado.readLine());
            cola.Colar(op1);
            System.out.println("Escribe el Operando 2:");
            op2=Integer.parseInt(teclado.readLine());
            cola.Colar(op2);
            System.out.println("Escribe el Operando 3:");
            op3=Integer.parseInt(teclado.readLine());
            cola.Colar(op3);
            System.out.println("Escribe el Operando 4:");
            op4=Integer.parseInt(teclado.readLine());
            cola.Colar(op4);
            System.out.println("Escribe el Operando 5:");
            op5=Integer.parseInt(teclado.readLine());
            cola.Colar(op5);
        }catch(ExcepColaCircLlena Err) {
            System.out.println(Err.getMessage());
	}

        float num=0;
	float newnum=0;
	switch(op) {
            case 1:
                x="+";
                try {
                    while(!cola.ColaVacia()) {
                    num=cola.Out();
                    newnum=num+newnum;
                    }
                }catch(ExcepColaCircVacia Err) {
                    System.out.println(Err.getMessage());
                }
            break;
            case 2:
                x="-";
                try {
                    while(!cola.ColaVacia()) {  
                        num=cola.Out();
		    	if(cola.Obtnerfrent()==1) {
                            newnum=num-newnum;
                        }else{
                            newnum=newnum-num;
                        } 
		    }
		}catch(ExcepColaCircVacia Err) {
                    System.out.println(Err.getMessage());
		}
            break;
            case 3:
            x="*";
            try {
                while(!cola.ColaVacia()) {  
                    num=cola.Out();
                    if(cola.Obtnerfrent()==1) {
                        newnum=num;
		    }else{
                        newnum=newnum*num;
		    } 
                }
            }catch(ExcepColaCircVacia Err) {
                System.out.println(Err.getMessage());
            }
            break;
            case 4:
            x="/";
            try {
                while(!cola.ColaVacia()) {  
                num=cola.Out();
                if(cola.Obtnerfrent()==1) {
                    newnum=num;
                }else{
                    newnum=(newnum)/(num);
                } 
            }
            }catch(ExcepColaCircVacia Err) {
		System.out.println(Err.getMessage());
            }
            break;
        }
            System.out.println("=~=~=~=~=~=~=~=~=~=~=~=~=~=~");
            System.out.println("Resultado :"+newnum);
            System.out.println("Notacion Polaca: "+x+" "+op1+" "+op2+" "+op3+" "+op4+" "+op5);
	}
    }