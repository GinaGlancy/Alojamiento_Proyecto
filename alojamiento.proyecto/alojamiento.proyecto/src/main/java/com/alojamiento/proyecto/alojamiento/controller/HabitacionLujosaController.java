package com.alojamiento.proyecto.alojamiento.controller;

import com.alojamiento.proyecto.alojamiento.model.HabitacionLujosa;
import com.alojamiento.proyecto.alojamiento.service.HabitacionLujosaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habitaciones-lujosas")
public class HabitacionLujosaController {
    private final HabitacionLujosaService service;

    public HabitacionLujosaController(HabitacionLujosaService service) {
        this.service = service;
    }

    @PostMapping
    public HabitacionLujosa crear(@RequestBody HabitacionLujosa h) {
        return service.guardar(h);
    }

    @GetMapping
    public List<HabitacionLujosa> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public HabitacionLujosa obtener(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }

    @PutMapping("/{id}")
    public HabitacionLujosa actualizar(@PathVariable Long id, @RequestBody HabitacionLujosa h) {
        h.setId(id);
        return service.guardar(h);
    }
}
