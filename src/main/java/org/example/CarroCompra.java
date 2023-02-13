package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarroCompra {
    private int id;
    public ArrayList<Producto> productos;
    public CarroCompra(int id) {

        this.id = id;
        this.productos = new ArrayList();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    public void addProducto(Producto nuevo) {
        this.productos.add(nuevo);
    }

    /*
    public Producto getProductosPorID(int id) {
        return (Producto)this.productos.stream().filter((e) -> {
            return e.getId() == id;
        }).findFirst().orElse((Object)null);
    }

     */

    public void cambiarProducto(Producto temp, int pos) {
        this.productos.set(pos, temp);
    }

    public int getPos(Integer id) {
        for(int cont = 0; cont < this.productos.size(); ++cont) {
            if (((Producto)this.productos.get(cont)).getId() == id) {
                return cont;
            }
        }

        return -1;
    }

    public void eliminarProductoPorId(int id) {
        int pos = this.getPos(id);
        this.productos.remove(pos);
    }

    public void borrarProductos() {
        this.productos = new ArrayList();
    }

}
