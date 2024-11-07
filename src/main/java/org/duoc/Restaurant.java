package org.duoc;

import org.duoc.empleados.Meseros;
import org.duoc.modelos.Clientes;
import org.duoc.modelos.Mesas;
import org.duoc.modelos.Pedidos;
import org.duoc.modelos.PlatoFondo;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Restaurant {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // We instantiate a Pedidos object
        Pedidos pedidos = new Pedidos();
        // We call the setMesero method and pass a Meseros object
        pedidos.setMesero(new Meseros("Juan", "Perez", 25, "12345678-9", "Mesero"));
        // We call the setClientes method and pass an ArrayList of Clientes objects
        // We instantiate an ArrayList of Clientes objects
        pedidos.setClientes(new ArrayList<Clientes>());
        // We add a new Clientes object to the ArrayList
        Mesas mesa = new Mesas(1, 4, false);
        pedidos.getClientes().add(new Clientes("Pedro", "Gonzalez", mesa ));

        // We call the setPlatosFondos method and pass an ArrayList of PlatoFondo objects
        // We instantiate an ArrayList of PlatoFondo objects
        pedidos.setPlatosFondos(new ArrayList<PlatoFondo>());
        // We add a new PlatoFondo object to the ArrayList
        pedidos.getPlatosFondos().add(new PlatoFondo("Lomo a lo pobre", "Carne, papas fritas, huevo frito, cebolla caramelizada", 8000));

        // We print the information of the Pedidos object
        System.out.println(pedidos.getMesero().getNombre());
        System.out.println(pedidos.getClientes().getFirst().getNombre());
        System.out.println(pedidos.getPlatosFondos().getFirst().getNombre());

    }
}