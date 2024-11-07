package org.duoc.empleados;

import org.duoc.interfaces.Cocina;

public class Cocineros extends Empleados implements Cocina {
    public Cocineros(String nombre, String apellido, int edad, String rut, String cargo) {
        super(nombre, apellido, edad, rut, cargo);
    }

    public void preparar() {
        System.out.println("Preparando...");
    }
}
