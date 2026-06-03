package com.mycompany.transportesfindeciclo.InterfazDao;

import com.mycompany.transportesfindeciclo.Objetos.Vehiculo;

public interface DaoVehiculos {
    boolean guardar(Vehiculo vehiculo);
    boolean actualizar(Vehiculo vehiculo);
    boolean eliminar(int id);
    Vehiculo buscarPorId(int id);
}