package org.example;

public class Usuario {
    private String usuario;
    private String nombre;
    private String password;

    public Usuario() {
        this.usuario = "";
        this.password = "";
    }

    public Usuario(String usuario, String nombre, String password) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.password = password;
    }
    public String getUsurio() {
        return usuario;
    }

    public void setUsurio(String usurio) {
        this.usuario = usurio;
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
