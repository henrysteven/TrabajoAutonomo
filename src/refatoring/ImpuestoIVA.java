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
public class ImpuestoIVA extends Impuesto {

    private final double porcentaje = 0.12;

    public ImpuestoIVA(double cantidad) {
        super(cantidad);
    }

    @Override
    public Number calcular() {
        return cantidad*porcentaje;
    }

}
