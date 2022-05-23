package com.icai.practicas.service;

import com.icai.practicas.model.DispositivoTipo;
import com.icai.practicas.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispositivoServiceImpl implements DispositivoService {

    @Autowired
    private DispositivoRepository dispositivoRepository;

    @Override
    public List<DispositivoTipo> getDispositivoTipos() {
        return dispositivoRepository.dispositivoTipoTodos();
    }

    @Override
    public List<DispositivoTipo> getDispositivoTiposTablet() {
        return dispositivoRepository.dispositivoTipoTablet();
    }

    @Override
    public void deleteDispositivo(int id) {
        dispositivoRepository.deleteDispositivo(id);
    }

    @Override
    public void updateQuery() {
        dispositivoRepository.updateQuery();
    }

    @Override
    public void insertDevice() {
        dispositivoRepository.insertDevice();
    }



}
