/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refatoring;

import java.util.Date;
import trabajoautonomo.*;


/**
 *
 * @author Henry
 */
public class Producto_refactoring {

    protected double precio;
    protected String nombre;
    protected String id;
    protected String descripcion;
    protected TipoProducto tipoProducto;
    protected boolean tieneImpuesto;
    protected TipoTransporte_refactoring  tipoTransporte;

    public Producto_refactoring(double precio, String nombre, String id, String descripcion, TipoProducto tipoProducto, boolean tieneImpuesto, TipoTransporte_refactoring tipoTransporte) {
        this.precio = precio;
        this.nombre = nombre;
        this.id = id;
        this.descripcion = descripcion;
        this.tipoProducto = tipoProducto;
        this.tieneImpuesto = tieneImpuesto;
        this.tipoTransporte = tipoTransporte;
    }

    
    // 4.	Feature Envy
    public Number calculoPVP(double ganancia) {
        return this.precio * calcularGanacia(tieneImpuesto, ganancia, tipoTransporte, ganancia) + this.precio;
    }
    // 4.	Feature Envy
    public Number impuesto(Impuesto impuesto) {
        return impuesto.cantidad;
    }
    
     public double calcularGanacia(boolean esTranportable, double gastoTransporte, TipoTransporte_refactoring transporte, double porcentajeGanancia) {
        if (esTranportable && transporte == TipoTransporte_refactoring.AIRE) {
            return porcentajeGanancia + gastoTransporte * 2;
        } else {
            return porcentajeGanancia;
        }

    }

     
    public void devolver(DescripcionAccion descripcion) {
        System.out.println("Devolver"+descripcion.getProducto().getNmbre());
        
    }
    
    public void Facturar(DescripcionAccion descripcionAccion) {
        System.out.println("Factura"+descripcionAccion.getProducto()+calcularGanacia(tieneImpuesto, precio, tipoTransporte, precio));
        
    }
    
   
    
    public void debitado(Producto producto,Date fecha,String concepto,int numeroFactura) {
        
    } 
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNmbre() {
        return nombre;
    }

    public void setNmbre(String nmbre) {
        this.nombre = nmbre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

}
