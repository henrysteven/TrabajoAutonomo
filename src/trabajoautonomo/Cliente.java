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
public class Cliente extends Persona {

    private String RUC;
    private int edad;
    private int numeroCliente;
    private String cuenta;

    public Cliente(String nombres, String apellidos, String cedula, int diasNacimiento, int mesesNacimiento, int anioNacimiento) {
        super(nombres, apellidos, cedula, diasNacimiento, mesesNacimiento, anioNacimiento);
    }

    //3.	Refused Bequest
    @Override
    public void pagar() {
    }

}
