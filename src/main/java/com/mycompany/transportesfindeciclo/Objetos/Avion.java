package com.mycompany.transportesfindeciclo.Objetos;

public class Avion extends Vehiculo {
    private String tipoAvion;
    private double alcanceVuelo;

    public Avion() {
    }

    public Avion(int id, String marca, String modelo, double capacidadCarga, String tipoAvion, double alcanceVuelo) {
        super(id, marca, modelo, capacidadCarga);
        this.tipoAvion = tipoAvion;
        this.alcanceVuelo = alcanceVuelo;
    }

    @Override
    public void transportar() {
        System.out.println("El avion transporta productos grandes o internacionales de forma rapida por aire.");
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo de avion: " + tipoAvion + " Alcance: " + alcanceVuelo + " km");
    }

    public String getTipoAvion() { return tipoAvion; }
    public void setTipoAvion(String tipoAvion) { this.tipoAvion = tipoAvion; }

    public double getAlcanceVuelo() { return alcanceVuelo; }
    public void setAlcanceVuelo(double alcanceVuelo) { this.alcanceVuelo = alcanceVuelo; }
}