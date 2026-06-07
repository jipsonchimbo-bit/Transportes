package com.mycompany.transportesfindeciclo.Objetos;

public class Carro extends Vehiculo {
    private String tipoCarro;

    public Carro() {
    }

    public Carro(int id, String marca, String modelo, double capacidadCarga, String tipoCarro) {
        super(id, marca, modelo, capacidadCarga);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public void transportar() {
        System.out.println("El carro transporta productos por carretera de forma eficiente.");
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo de carro: " + tipoCarro);
    }

    public String getTipoCarro() { return tipoCarro; }
    public void setTipoCarro(String tipoCarro) { this.tipoCarro = tipoCarro; }
}