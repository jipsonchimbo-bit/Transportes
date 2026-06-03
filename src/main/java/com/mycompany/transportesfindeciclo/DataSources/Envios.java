package com.mycompany.transportesfindeciclo.datasources;

import com.mycompany.transportesfindeciclo.Objetos.Envio;
import com.mycompany.transportesfindeciclo.InterfazDao.DaoEnvios;

public class Envios implements DaoEnvios{
    private Envio[] listaEnvios;
    private int contador;

    public Envios() {
        this.listaEnvios = new Envio[20];
        this.contador = 0;
    }

    @Override
    public boolean guardar(Envio envio) {
        if (envio == null || contador >= listaEnvios.length) return false;
        listaEnvios[contador] = envio;
        contador++;
        return true;
    }

    @Override
    public boolean actualizar(Envio envio) {
        if (envio == null) return false;
        for (int i = 0; i < contador; i++) {
            if (listaEnvios[i].getId() == envio.getId()) {
                listaEnvios[i] = envio;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        for (int i = 0; i < contador; i++) {
            if (listaEnvios[i].getId() == id) {
                for (int j = i; j < contador - 1; j++) {
                    listaEnvios[j] = listaEnvios[j + 1];
                }
                listaEnvios[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Envio buscarPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (listaEnvios[i].getId() == id) {
                return listaEnvios[i];
            }
        }
        return null;
    }
}