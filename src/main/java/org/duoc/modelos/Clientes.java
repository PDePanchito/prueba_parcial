package org.duoc.modelos;

public class Clientes {
    private String nombre;
    private String apellido;
    private Mesas mesa;

    public Clientes(String nombre, String apellido, Mesas mesa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mesa = mesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Mesas getMesa() {
        return mesa;
    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }
}

