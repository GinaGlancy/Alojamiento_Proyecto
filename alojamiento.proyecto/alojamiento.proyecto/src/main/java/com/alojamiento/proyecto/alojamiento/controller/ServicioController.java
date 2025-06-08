package com.alojamiento.proyecto.alojamiento.controller;



import com.alojamiento.proyecto.alojamiento.model.Servicio;
import com.alojamiento.proyecto.alojamiento.repository.ServicioRepository;
import com.alojamiento.proyecto.alojamiento.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/servicios")
public class ServicioController {

    @Autowired
    private ServicioRepository servicioRepository;

    @PostMapping
    public Servicio crearServicio(@RequestBody Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    @GetMapping
    public List<Servicio> listar() {
        return servicioRepository.findAll();
    }
}

