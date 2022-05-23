package com.icai.practicas.service;

import com.icai.practicas.model.DispositivoTipo;

import java.util.List;

public interface DispositivoService {

    List<DispositivoTipo> getDispositivoTipos();

    List<DispositivoTipo> getDispositivoTiposTablet();

    void deleteDispositivo(int id);

    void updateQuery();

    void insertDevice();
}
