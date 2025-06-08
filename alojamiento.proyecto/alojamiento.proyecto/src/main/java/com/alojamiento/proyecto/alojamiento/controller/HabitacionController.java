package com.alojamiento.proyecto.alojamiento.controller;


import com.alojamiento.proyecto.alojamiento.model.Habitacion;
import com.alojamiento.proyecto.alojamiento.service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {

    @Autowired
    private HabitacionService habitacionService;

    @GetMapping
    public List<Habitacion> listar() {
        return habitacionService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Habitacion> obtener(@PathVariable Long id) {
        return habitacionService.obtenerPorId(id);
    }

    @PostMapping
    public Habitacion crear(@RequestBody Habitacion habitacion) {
        return habitacionService.guardar(habitacion);
    }

    @PutMapping("/{id}")
    public Habitacion actualizar(@PathVariable Long id, @RequestBody Habitacion habitacion) {
        habitacion.setId(id);
        return habitacionService.guardar(habitacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        habitacionService.eliminar(id);
    }
}
