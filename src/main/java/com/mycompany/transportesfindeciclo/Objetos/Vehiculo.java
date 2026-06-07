package com.mycompany.transportesfindeciclo.Objetos;

public abstract class Vehiculo {
    private int id;
    private String marca;
    private String modelo;
    private double capacidadCarga;

    public Vehiculo() {
    }

    public Vehiculo(int id, String marca, String modelo, double capacidadCarga) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }

    public double calcularDistancia(double velocidad) {
        return velocidad * 1.0;
    }

    public double calcularDistancia(double velocidad, double tiempo) {
        return velocidad * tiempo;
    }

    public double calcularDistancia(double velocidad, double tiempo, double eficiencia) {
        return (velocidad * tiempo) * eficiencia;
    }
    public abstract void transportar();

    public void imprimirInformacion() {
        System.out.println("ID: " + id + " Marca: " + marca + " Modelo: " + modelo + " Capacidad: " + capacidadCarga + " kg");
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getCapacidadCarga() { return capacidadCarga; }
    public void setCapacidadCarga(double capacidadCarga) { this.capacidadCarga = capacidadCarga; }
}