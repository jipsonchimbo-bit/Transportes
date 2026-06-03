package com.mycompany.transportesfindeciclo.Objetos;

public class Producto {
    private int id;
    private String nombre;
    private double peso;
    private String descripcion;

    public Producto() {
    }

    public Producto(int id, String nombre, double peso, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}