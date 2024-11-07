package org.duoc.empleados;

import org.duoc.interfaces.Orden;

public class Meseros extends Empleados implements Orden {
    public Meseros(String nombre, String apellido, int edad, String rut, String cargo) {
        super(nombre, apellido, edad, rut, cargo);
    }

    public void servir() {
        System.out.println("Sirviendo...");
    }
}
