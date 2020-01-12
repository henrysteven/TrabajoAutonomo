/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refatoring;

/**
 *
 * @author Henry
 */
public class Impuesto {

    protected double cantidad;

    public Impuesto(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
   
    public Number calcular() {
        return null;
    }
}
