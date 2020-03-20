/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas.Control;

/**
 *
 * @author Camiloc
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import notas.Modelo.Estudiante;
import notas.Vista.Vista;

import notas.Modelo.Estudiante;
import notas.Vista.Vista;

public class Control implements ActionListener{
     
    private Estudiante estudiante;
    private Vista vista;
    
    public Control(Estudiante estudiante, Vista vista) {
        super();
        this.vista=vista;
        this.estudiante=estudiante;
        actionListener(this);
    }
    
    private void actionListener(ActionListener controlador){
        
     vista.jButton1.addActionListener(controlador);
     vista.jButton2.addActionListener(controlador);
     vista.jButton3.addActionListener(controlador);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        if(e.getActionCommand().contentEquals("Registrar")){
            
            estudiante.notas.add(Double.parseDouble(vista.jTextField1.getText()));
            estudiante.notas.add(Double.parseDouble(vista.jTextField2.getText()));
            estudiante.notas.add(Double.parseDouble(vista.jTextField3.getText()));
            estudiante.notas.add(Double.parseDouble(vista.jTextField4.getText()));
            estudiante.notas.add(Double.parseDouble(vista.jTextField5.getText()));
            estudiante.notas.add(Double.parseDouble(vista.jTextField6.getText()));
            estudiante.notas.add(Double.parseDouble(vista.jTextField7.getText()));
            estudiante.notas.add(Double.parseDouble(vista.jTextField8.getText()));
            estudiante.notas.add(Double.parseDouble(vista.jTextField9.getText()));
            estudiante.notas.add(Double.parseDouble(vista.jTextField10.getText()));
            estudiante.notas.add(Double.parseDouble(vista.jTextField11.getText()));
            estudiante.notas.add(Double.parseDouble(vista.jTextField12.getText()));
            
        }
        else if(e.getActionCommand().contentEquals("Promedio")){
            vista.jTextField13.setText(Double.toString(estudiante.promedio()));
//         vista.jTextField13.setText(Estudiante.class.);
        }
        else if(e.getActionCommand().contentEquals("MayorPromedio")){
        vista.jTextField13.setText(Integer.toString(estudiante.darCantidadSobrePromedio()));
        }         
            }
    }

