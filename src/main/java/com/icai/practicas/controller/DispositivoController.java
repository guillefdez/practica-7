package com.icai.practicas.controller;

import com.icai.practicas.model.DispositivoTipo;
import com.icai.practicas.service.DispositivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DispositivoController {

    @Autowired
    private DispositivoService dispositivoService;

    @GetMapping(path = "/devices", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DispositivoTipo>> getDispositivoWithTipos() {
        return ResponseEntity.ok().body(dispositivoService.getDispositivoTipos());
    }

    @GetMapping(path = "/devices/tablet", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DispositivoTipo>> getDispositivoWithTiposTablet() {
        return ResponseEntity.ok().body(dispositivoService.getDispositivoTiposTablet());
    }

    @GetMapping(path = "/devices/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> removeDevice(@PathVariable Integer id) {
        dispositivoService.deleteDispositivo(id);
        return ResponseEntity.ok().body(id);
    }


    @GetMapping(path = "/devices/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> updateDevice() {
        dispositivoService.updateQuery();
        return ResponseEntity.ok().body(200);
    }


    @GetMapping(path = "/devices/insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> insertDevice() {
        dispositivoService.insertDevice();
        return ResponseEntity.ok().body(200);
    }
}
