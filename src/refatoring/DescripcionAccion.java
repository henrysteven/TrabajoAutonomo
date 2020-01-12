/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refatoring;

import java.util.Date;
import trabajoautonomo.Producto;

/**
 *
 * @author Henry
 */
public class DescripcionAccion {
    protected Producto producto;
    protected Date fecha;
    protected String concepto;
    protected int numeroFactura;

    public DescripcionAccion(Producto producto, Date fecha, String concepto, int numeroFactura) {
        this.producto = producto;
        this.fecha = fecha;
        this.concepto = concepto;
        this.numeroFactura = numeroFactura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    
    
}
