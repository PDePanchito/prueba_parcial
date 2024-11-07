package org.duoc.empleados;

import org.duoc.interfaces.Caja;

public class Cajeros extends Empleados implements Caja {
    public Cajeros(String nombre, String apellido, int edad, String rut, String cargo) {
        super(nombre, apellido, edad, rut, cargo);
    }

    public void cobrar() {
        System.out.println("Cobrando...");
    }

    public void totalVentas() {
        System.out.println("Total de ventas...");
    }

}
