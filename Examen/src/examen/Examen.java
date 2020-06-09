/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Miguel Angel
 */

import java.util.Random;

public class Examen {
    public static void main(String[] args) {

        Random Spwaner = new Random();

        PilaExamen MaderaL= new PilaExamen();//lista de madera
        PilaExamen HiloL =new PilaExamen();//lista de hilo
        PilaExamen ResinaL = new PilaExamen();//lista de resina

        int maderaAcum=0,hiloAcum=0,resinaAcum=0; //++
        int madera = 0, hilo = 0, resina = 0, baston = 0, cuerda = 0, caña = 0; // elementos de operación

        int mesaCrafteada=0,bastonCrafteada=0,cuerdaCrafteada=0,cañaCrafteada=0,barcoCrafteado=0;
        //objetos crafteados
        for(int i=1;i<=30;i++){

            System.out.println("****************DIA "+ i +"*************");

            try{
                int x = Spwaner.nextInt(3);
                if(x == 0){
                    System.out.println("Encontraste 1 de madera  ");
                    MaderaL.ApilacionP(x);
                    madera++;
                    maderaAcum++;
                }else if(x == 1){
                    System.out.println("Encontraste 1 de hilo");
                    HiloL.ApilacionP(x);
                    hilo++;
                    hiloAcum++;
                }else if(x == 2){
                    System.out.println("Encontraste 1 de resina ");
                    ResinaL.ApilacionP(x);
                    resina++;
                    resinaAcum++;
                }

                if(madera == 4){
                    MaderaL.SacarP();
                    MaderaL.SacarP();
                    MaderaL.SacarP();
                    MaderaL.SacarP();
                    madera = madera - 4;
                    mesaCrafteada++;
                    System.out.println("Crafteaste una mesa");
                }

                if(mesaCrafteada == 1 && madera == 2){
                    MaderaL.SacarP();
                    MaderaL.SacarP();
                    madera = madera - 2;
                    baston++;
                    bastonCrafteada++;
                    System.out.println("Crafteaste un bastón");
                }

                if(mesaCrafteada == 1){
                    if(hilo >= 4 && resina >= 1){
                        HiloL.SacarP();
                        HiloL.SacarP();
                        HiloL.SacarP();
                        HiloL.SacarP();

                        //listaR.EliminarAlInicio();
                        hilo = hilo - 4;
                        resina = resina - 1;
                        cuerda++;
                        cuerdaCrafteada++;
                        System.out.println("Crafteaste una cuerda");
                    }
                }

                if(mesaCrafteada == 1){
                    if(cuerda >=1 && baston >= 1){
                        cuerda = cuerda - 1;
                        baston = baston - 1;
                        caña++;
                        cañaCrafteada++;
                        System.out.println("Crafteaste una caña");
                    }
                }

                if (mesaCrafteada == 1 && caña >= 1)
                {
                    caña = caña - 1;
                    barcoCrafteado++;
                    System.out.println("Has crafteado un barco");
                }
            }catch(DesbP err){
                System.out.println(err.getMessage());
            } catch (SubDesbP er){
                System.out.println(er.getMessage());
            }
        } // FIN DEL CLICO FOR

        System.out.println("****************Obtuviste***************");
        System.out.println("Madera " + maderaAcum);
        System.out.println("Resina " + resinaAcum);
        System.out.println("Hilo " + hiloAcum);
        System.out.println();
        System.out.println("****************Crafteaste***************");
        System.out.println("Cañas "+cañaCrafteada);
        System.out.println("Mesas "+mesaCrafteada);
        System.out.println("Baston "+bastonCrafteada);
        System.out.println("Cuerda "+cuerdaCrafteada);
        System.out.println("Barco "+barcoCrafteado);

    }
}