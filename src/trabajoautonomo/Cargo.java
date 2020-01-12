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
public class Cargo {
    private String empresa;
    private String cargo;
    private String AniosTrabajo;

    public Cargo(String empresa, String cargo, String AniosTrabajo) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.AniosTrabajo = AniosTrabajo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAniosTrabajo() {
        return AniosTrabajo;
    }

    public void setAniosTrabajo(String AniosTrabajo) {
        this.AniosTrabajo = AniosTrabajo;
    }
    
    
    
    
}
