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
public class Estudiantes {
    private String Nombre;
    private String NoControl;
    public Estudiantes(String Nombre,String NoControl){
        this.Nombre = Nombre;
        this.NoControl = NoControl;
    }
    
    public String toString(){
        return Nombre + "\n" + NoControl;
    }
}
