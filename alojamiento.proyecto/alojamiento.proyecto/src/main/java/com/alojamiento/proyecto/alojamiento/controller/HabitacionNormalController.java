package com.alojamiento.proyecto.alojamiento.controller;

import com.alojamiento.proyecto.alojamiento.model.HabitacionNormal;
import com.alojamiento.proyecto.alojamiento.service.HabitacionNormalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habitaciones-normales")
public class HabitacionNormalController {
    private final HabitacionNormalService service;

    public HabitacionNormalController(HabitacionNormalService service) {
        this.service = service;
    }

    @PostMapping
    public HabitacionNormal crear(@RequestBody HabitacionNormal h) {
        return service.guardar(h);
    }

    @GetMapping
    public List<HabitacionNormal> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public HabitacionNormal obtener(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }

    @PutMapping("/{id}")
    public HabitacionNormal actualizar(@PathVariable Long id, @RequestBody HabitacionNormal h) {
        h.setId(id);
        return service.guardar(h);
    }
}
