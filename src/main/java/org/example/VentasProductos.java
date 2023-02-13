package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

public class VentasProductos {
    private int id;
    private String nombreCliente;
    private ArrayList<Producto> listaProductos;
    Date fechaCompra = new Date();
    public VentasProductos(String nombre, ArrayList<Producto> productos) {
        this.nombreCliente = nombre;
        this.listaProductos = productos;
    }
    public VentasProductos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Producto> getListaProductos() {
        return this.listaProductos;
    }
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getFechaCompra() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
        String date = dateFormat.format(this.fechaCompra);
        return date;
    }

    /*
    public Integer getTotal() {
        Integer total = 0;

        Producto producto;
        for(Iterator var2 = this.listaProductos.iterator(); var2.hasNext(); total = total + producto.getPrecio() * producto.getCantidad()) {
            producto = (Producto)var2.next();
        }

        return total;
    }

    */

}
