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
public class Persona {

    protected String nombres;
    protected String apellidos;
    protected String cedula;
    protected int diasNacimiento;// Primitive Obsession
    protected int mesesNacimiento;
    protected int anioNacimiento;
    protected String telefono;
    protected Cargo cargo;

    public Persona(String nombres, String apellidos, String cedula, int diasNacimiento, int mesesNacimiento, int anioNacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        if (validarFecha(diasNacimiento, anioNacimiento, anioNacimiento)) {
            this.diasNacimiento = diasNacimiento;
            this.anioNacimiento = anioNacimiento;
            this.mesesNacimiento = mesesNacimiento;
        }

    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getDiasNacimiento() {
        return diasNacimiento;
    }

    public void setDiasNacimiento(int diasNacimiento) {
        this.diasNacimiento = diasNacimiento;
    }

    public int getMesesNacimiento() {
        return mesesNacimiento;
    }

    public void setMesesNacimiento(int mesesNacimiento) {
        this.mesesNacimiento = mesesNacimiento;
    }

    public int getAniosNacimiento() {
        return anioNacimiento;
    }

    public void setAniosNacimiento(int añosNacimiento) {
        this.anioNacimiento = añosNacimiento;
    }

    private boolean validarFecha(int dia, int mes, int anio) {
        if (dia <= 30) {
            if (mes <= 12) {
                if (anio >= 1997 && anio <= 2050) {
                    return true;
                } else {
                    System.out.println("Fecha no valida");
                    return false;
                }
            } else {
                System.out.println("Fecha no valida");
                return false;
            }
        } else {
            System.out.println("Fecha no valida");
            return false;
        }
    }

    public void cobrar() {
        // cobra deuda a cliente
    }
    
    public void pagar(){
        // paga deuda de productos
    }
}
