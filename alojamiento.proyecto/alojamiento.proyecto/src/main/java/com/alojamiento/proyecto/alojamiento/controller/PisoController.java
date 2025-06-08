package com.alojamiento.proyecto.alojamiento.controller;



import com.alojamiento.proyecto.alojamiento.model.Piso;
import com.alojamiento.proyecto.alojamiento.service.PisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pisos")
public class PisoController {

    @Autowired
    private PisoService pisoService;

    @GetMapping
    public List<Piso> listar() {
        return pisoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Piso> obtener(@PathVariable Long id) {
        return pisoService.obtenerPorId(id);
    }

    @PostMapping
    public Piso crear(@RequestBody Piso piso) {
        return pisoService.guardar(piso);
    }

    @PutMapping("/{id}")
    public Piso actualizar(@PathVariable Long id, @RequestBody Piso piso) {
        piso.setId(id);
        return pisoService.guardar(piso);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        pisoService.eliminar(id);
    }
}
