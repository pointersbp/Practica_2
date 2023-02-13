package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarroCompra {
    private int id;
    List<Producto> list = new ArrayList<Producto>();
    public CarroCompra(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
