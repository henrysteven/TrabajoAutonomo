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
public class Persona_refactoring {

    private String nombres;
    private String apellidos;
    private String cedula;
    private Date fechaNacimineto;
    private String telefono;
    private Cargo_refactoring cargo;

    public Persona_refactoring(String nombres, String apellidos, String cedula, Date fechaNacimineto, String telefono, Cargo_refactoring cargo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.fechaNacimineto = fechaNacimineto;
        this.telefono = telefono;
        this.cargo = cargo;
    }

    public Persona_refactoring(String nombres, String apellidos, String cedula, Date fechaNacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.fechaNacimineto= fechaNacimiento;
        

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

    public Date getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(Date fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cargo_refactoring getCargo() {
        return cargo;
    }

    public void setCargo(Cargo_refactoring cargo) {
        this.cargo = cargo;
    }

    
}
