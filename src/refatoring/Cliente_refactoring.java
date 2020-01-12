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
public class Cliente_refactoring extends Persona_refactoring{
    private String RUC;
    private int edad;
    private int numeroCliente;
    private String cuenta;

    public Cliente_refactoring(String nombres, String apellidos, String cedula, Date fechaNacimineto, String telefono, Cargo_refactoring cargo) {
        super(nombres, apellidos, cedula, fechaNacimineto, telefono, cargo);
    }

   
    
    public void pagar(){
        // paga deuda de productos
    }

    
    
}
