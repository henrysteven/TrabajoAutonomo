/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoautonomo;

import java.util.Date;

/**
 *
 * @author Henry
 */
public class Producto {

    protected double precio;
    protected String nombre;
    protected String id;
    protected String descripcion;
    protected TipoProducto tipoProducto;
    protected boolean tieneImpuesto;
    protected TipoTranporte tipoTransporte;

    public Producto(double precio, String nombre, String id, String descripcion, TipoProducto tipoProducto, boolean tieneImpuesto, TipoTranporte tipoTransporte) {
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
        Calculo c = new Calculo();
        return this.precio * c.calcularGanacia(tieneImpuesto, ganancia, this.tipoTransporte, ganancia) + this.precio;
    }

    // 4.	Feature Envy
    public double impuestoProducto(tipoImpuesto tipoImpuesto) {
        Calculo c = new Calculo();
        return (double) c.impuesto(precio, tipoImpuesto);
    }

    
    //•	Data clumps
    public void devolver(Producto producto,Date fecha,String concepto,int numeroFactura) {
        
    }
    //•	Data clumps
    public void Facturar(Producto producto,Date fecha,String concepto,int numeroFactura) {
        
    }
    
    // Data clumps
    
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
