package com.mycompany.transportesfindeciclo.Objetos;

public class Moto extends Vehiculo {
    private int tipoMotor;

    public Moto() {
    }

    public Moto(int id, String marca, String modelo, double capacidadCarga, int tipoMotor) {
        super(id, marca, modelo, capacidadCarga);
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void transportar() {
        System.out.println("La moto transporta pequeños productos rapidamente en zonas urbanas.");
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Capacidad del cilindro: " + tipoMotor + " cc");
    }

    public int gettipoMotor() { return tipoMotor; }
    public void settipoMotor(int tipoMotor) { this.tipoMotor = tipoMotor; }
}