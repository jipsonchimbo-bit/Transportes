package com.mycompany.transportesfindeciclo.InterfazDao;

import com.mycompany.transportesfindeciclo.Objetos.Envio;

public interface DaoEnvios {
    boolean guardar(Envio envio);
    boolean actualizar(Envio envio);
    boolean eliminar(int id);
    Envio buscarPorId(int id);
}