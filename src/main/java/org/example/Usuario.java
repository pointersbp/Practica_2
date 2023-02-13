package org.example;

public class Usuario {
    private String usurio;
    private String nombre;
    private String password;
    public Usuario(String usurio, String nombre, String password) {
        this.usurio = usurio;
        this.nombre = nombre;
        this.password = password;
    }
    public String getUsurio() {
        return usurio;
    }

    public void setUsurio(String usurio) {
        this.usurio = usurio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
