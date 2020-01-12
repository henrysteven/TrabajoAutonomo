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
public class Calculo {

    // switch statements
    public Number impuesto(double cantidad, tipoImpuesto tipo) {
        if (tipo == tipoImpuesto.Renta) {
            return cantidad * 0.23;
        }
        if (tipo == tipoImpuesto.Iva) {
            return cantidad * 0.12;
        }
        if (tipo == tipoImpuesto.Divisa) {
            return cantidad * 0.05;
        }
        return null;
    }

    public double calcularGanacia(boolean esTranportable, double gastoTransporte,TipoTranporte transporte,double porcentajeGanancia) {
        if (esTranportable && transporte == TipoTranporte.AIRE) {
            return porcentajeGanancia+ gastoTransporte*2;
        } else {
            return porcentajeGanancia;
        }

    }

    public void calcular() {
    }
}
