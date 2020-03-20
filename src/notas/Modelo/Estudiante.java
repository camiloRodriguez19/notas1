/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas.Modelo;
import java.util.ArrayList;
/**
 *
 * @author Camiloc
 */
public class Estudiante {
    
    private int totalE;
    public ArrayList <Double> notas;
    
    private String nombre;
    private String codigo;
    private String telefono;
    private Double nota;

    public Estudiante(String nombre, String codigo, String telefono, double nota, int totalE) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.telefono = telefono;
        this.nota = nota;
        this.totalE = 12;
    }
    
    public Estudiante( )
    {
       notas = new ArrayList<Double>();
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

   
    public int getTotalE() {
        return totalE;
    }

    public void setTotalE(int totalE) {
        this.totalE = totalE;
    }
    
    public double promedio( )
    {
        double suma = 0;
     
        for(int i=0;i<notas.size();)
        {
            suma += notas.get(i);
            i++;
        }
        Double prome= suma / notas.size();
        return prome;
    }
    
    public int darCantidadSobrePromedio( )
    {
        // Saca el promedio utilizando el método promedio()
        double promedio = promedio( );

        // Calcula el número de notas mayores
        int vanEncima = 0;
        for( int indice = 0; indice < notas.size(); indice++ )
        {
            if( notas.get(indice)> promedio )
            {
                vanEncima++;
            }
        }
        return vanEncima;
    }
    

}
