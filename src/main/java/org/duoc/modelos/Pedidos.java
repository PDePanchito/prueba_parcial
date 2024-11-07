package org.duoc.modelos;

import org.duoc.empleados.Meseros;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pedidos {
    private Meseros mesero;
    private ArrayList<Clientes> clientes;
    private ArrayList<PlatoFondo> platosFondos;
    private ArrayList<Bebida> bebidas;
    private ArrayList<Postre> postres;
    private ArrayList<Entrada> entradas;
    private ArrayList<Mesas> mesas;

    public Pedidos(Meseros mesero, ArrayList<Clientes> clientes, ArrayList<PlatoFondo> platosFondos, ArrayList<Bebida> bebidas, ArrayList<Postre> postres, ArrayList<Entrada> entradas, ArrayList<Mesas> mesas) {
        this.mesero = mesero;
        this.clientes = clientes;
        this.platosFondos = platosFondos;
        this.bebidas = bebidas;
        this.postres = postres;
        this.entradas = entradas;
        this.mesas = mesas;
    }

    public Meseros getMesero() {
        return mesero;
    }

    public void setMesero(Meseros mesero) {
        this.mesero = mesero;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<PlatoFondo> getPlatosFondos() {
        return platosFondos;
    }

    public void setPlatosFondos(ArrayList<PlatoFondo> platosFondos) {
        this.platosFondos = platosFondos;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public ArrayList<Postre> getPostres() {
        return postres;
    }

    public void setPostres(ArrayList<Postre> postres) {
        this.postres = postres;
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }

    public ArrayList<Mesas> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesas> mesas) {
        this.mesas = mesas;
    }
}
