/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refatoring;

import java.util.Date;





/**
 *
 * @author Henry
 */
public class Empleado_refactoring extends Persona_refactoring{
    private double sueldo;
    private int numeroHijos;
    private int horasExtras;

    public Empleado_refactoring(String nombres, String apellidos, String cedula, Date fechaNacimineto, String telefono, Cargo_refactoring cargo) {
        super(nombres, apellidos, cedula, fechaNacimineto, telefono, cargo);
    }
    
     public void cobrar() {
        // cobra deuda a cliente
    }
    
    
    
    
}
