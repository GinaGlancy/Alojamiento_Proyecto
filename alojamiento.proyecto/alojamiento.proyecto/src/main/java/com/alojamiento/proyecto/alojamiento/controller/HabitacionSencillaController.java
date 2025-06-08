package com.alojamiento.proyecto.alojamiento.controller;

import com.alojamiento.proyecto.alojamiento.model.HabitacionSencilla;
import com.alojamiento.proyecto.alojamiento.service.HabitacionSencillaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habitaciones-sencillas")
public class HabitacionSencillaController {

    @Autowired
    private HabitacionSencillaService habitacionSencillaService;

    @PostMapping
    public HabitacionSencilla crear(@RequestBody HabitacionSencilla habitacion) {
        return habitacionSencillaService.crear(habitacion);
    }

    @GetMapping
    public List<HabitacionSencilla> listar() {
        return habitacionSencillaService.listar();
    }
}
