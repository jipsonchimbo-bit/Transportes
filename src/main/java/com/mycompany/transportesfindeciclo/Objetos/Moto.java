package com.mycompany.transportesfindeciclo.Objetos;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto() {
    }

    public Moto(int id, String marca, String modelo, double capacidadCarga, int cilindraje) {
        super(id, marca, modelo, capacidadCarga);
        this.cilindraje = cilindraje;
    }

    @Override
    public void transportar() {
        System.out.println("La motocicleta transporta pequeños productos rapidamente en zonas urbanas.");
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Capacidad del cilindraje: " + cilindraje + " cc");
    }

    public int getCilindraje() { return cilindraje; }
    public void setCilindraje(int cilindraje) { this.cilindraje = cilindraje; }
}