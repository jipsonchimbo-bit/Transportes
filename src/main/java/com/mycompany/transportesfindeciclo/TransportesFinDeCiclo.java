package com.mycompany.transportesfindeciclo;

import com.mycompany.transportesfindeciclo.DataSources.Vehiculos;
import com.mycompany.transportesfindeciclo.InterfazDao.DaoVehiculos;
import com.mycompany.transportesfindeciclo.Objetos.*;

public class TransportesFinDeCiclo {

    public static void main(String[] args) {
        System.out.println("Gestion de diferentes transportes");
        
        DaoVehiculos fuenteVehiculos = new Vehiculos(); 

        Vehiculo carro= new Carro(1, "Hino", "GD 2026", 1226, "Camion de carga pesada");
        Vehiculo moto = new Moto(2, "Shineray", "XY200 Negro",90, 2000); 
        Vehiculo avion = new Avion(3, "Boeing", "747", 70000, "Avion comercial para cargas pesadas", 20000);

        fuenteVehiculos.guardar(carro);
        fuenteVehiculos.guardar(moto);
        fuenteVehiculos.guardar(avion);

        System.out.println("Transportes ");
        carro.transportar();
        moto.transportar();
        avion.transportar();

        System.out.println("Calcular la distancia ");
        double distCarro = carro.calcularDistancia(90.0);
        System.out.println("La distancia del carro en el tiempo fijo 1 hora: " + distCarro + " km");

        double distMoto = moto.calcularDistancia(80.0, 2.0);
        System.out.println("Distancia de la moto (80km/h * 2h): " + distMoto + " km");

        double distAvion = avion.calcularDistancia(800.0, 2.0, 1.2);
        System.out.println("Distancia del avion con eficiencia 1.2: " + distAvion + " km");
    }
}