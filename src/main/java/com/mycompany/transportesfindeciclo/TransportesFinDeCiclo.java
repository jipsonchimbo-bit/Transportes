package com.mycompany.transportesfindeciclo;
import com.mycompany.transportesfindeciclo.DataSources.Vehiculos;
import com.mycompany.transportesfindeciclo.InterfazDao.DaoEnvios;
import com.mycompany.transportesfindeciclo.InterfazDao.DaoVehiculos;
import com.mycompany.transportesfindeciclo.Objetos.*;
import com.mycompany.transportesfindeciclo.datasources.Envios;

public class TransportesFinDeCiclo {

    public static void main(String[] args) {
        System.out.println("Transportes fin de ciclo");

        DaoVehiculos Vehiculos = new Vehiculos(); 
        DaoEnvios Envios = new Envios();

        Vehiculo auto = new Carro(1, "Hino", "GD 2026", 1200, "Carro de carga pesada");
        Vehiculo moto = new Moto(2, "Shineray", "XY200", 90, 2000); 
        Vehiculo avion = new Avion(3, "Airbus", "330", 70000, "Avion de carga pesada", 20000);

        Vehiculos.guardar(auto);
        Vehiculos.guardar(moto);
        Vehiculos.guardar(avion);

        System.out.println("Metodos de trsnaportes");
        auto.transportar();
        moto.transportar();
        avion.transportar();

        System.out.println("Calcular las distancias recorridas:");
        double distCarro = auto.calcularDistancia(90.0);
        System.out.println("La distancia del carro en el tiempo fijo 1 hora: " + distCarro + " km");

        double distMoto = moto.calcularDistancia(80.0, 2.0);
        System.out.println("Distancia de la moto (80km/h * 2h): " + distMoto + " km");

        double distAvion = avion.calcularDistancia(800.0, 2.0, 1.2);
        System.out.println("Distancia del avion Con eficiencia 1.2: " + distAvion + " km");

        System.out.println("Registros de envios");
        Producto producto1 = new Producto(200, "Materiales de aseo", 250, "Productos estables");
        Envio envio1 = new Envio(300, producto1, auto, "Guayaquil y Quito", distCarro);

        if (Envios.guardar(envio1)) {
            System.out.println("El envio " + envio1.getId() + " se guardado con exito hacia " + envio1.getDestino() + ".");
        }
    }
}