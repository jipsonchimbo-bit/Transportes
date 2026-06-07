package com.mycompany.transportesfindeciclo.DataSources;

import com.mycompany.transportesfindeciclo.InterfazDao.DaoVehiculos;
import com.mycompany.transportesfindeciclo.Objetos.Vehiculo;

public class Vehiculos implements DaoVehiculos {
    private Vehiculo[] listaVehiculos;
    private int contador;

    public Vehiculos() {
        this.listaVehiculos = new Vehiculo[20];
        this.contador = 0;
    }

    @Override
    public boolean guardar(Vehiculo vehiculo) {
        if (vehiculo == null || contador >= listaVehiculos.length) return false;
        if (buscarPorId(vehiculo.getId()) != null) return false;
        listaVehiculos[contador] = vehiculo;
        contador++;
        return true;
    }

    @Override
    public boolean actualizar(Vehiculo vehiculo) {
        if (vehiculo == null) return false;
        for (int i = 0; i < contador; i++) {
            if (listaVehiculos[i].getId() == vehiculo.getId()) {
                listaVehiculos[i] = vehiculo;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        for (int i = 0; i < contador; i++) {
            if (listaVehiculos[i].getId() == id) {
                for (int j = i; j < contador - 1; j++) {
                    listaVehiculos[j] = listaVehiculos[j + 1];
                }
                listaVehiculos[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Vehiculo buscarPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (listaVehiculos[i].getId() == id) {
                return listaVehiculos[i];
            }
        }
        return null;
    }
}