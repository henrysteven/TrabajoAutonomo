/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoautonomo;

/**
 *
 * @author Henry
 */
public class Empleado extends Persona {

    private double sueldo;
    private int numeroHijos;
    private int horasExtras;

    public Empleado(String nombres, String apellidos, String cedula, int diasNacimiento, int mesesNacimiento, int anioNacimiento) {
        super(nombres, apellidos, cedula, diasNacimiento, mesesNacimiento, anioNacimiento);
    }
    //3.	Refused Bequest
    @Override
    public void cobrar() {
        
    }
}
