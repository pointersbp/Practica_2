package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VentasProductos {
    private int id;
    private String nombreCliente;
    List<Producto> list = new ArrayList<Producto>();
    Date fechaCompra = new Date();
    public VentasProductos(int id, String nombreCliente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}
