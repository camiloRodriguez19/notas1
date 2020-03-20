/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author Camiloc
 */
import notas.Vista.Vista;
import notas.Modelo.Estudiante;
import notas.Control.Control;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Vista v = new Vista();
        Estudiante e = new Estudiante();
        Control c = new Control (e,v);
        // TODO code application logic here
    }
    
}
