package com.mycompany.transportesfindeciclo.Objetos;

public class Envio {
    private int id;
    private Producto producto;
    private Vehiculo vehiculo;
    private String destino;
    private double distancia;

    public Envio() {
    }

    public Envio(int id, Producto producto, Vehiculo vehiculo, String destino, double distancia) {
        this.id = id;
        this.producto = producto;
        this.vehiculo = vehiculo;
        this.destino = destino;
        this.distancia = distancia;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public Vehiculo getVehiculo() { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public double getDistancia() { return distancia; }
    public void setDistancia(double distancia) { this.distancia = distancia; }
}