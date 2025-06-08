package com.alojamiento.proyecto.alojamiento.controller;

import com.alojamiento.proyecto.alojamiento.model.ReservaHabitacion;
import com.alojamiento.proyecto.alojamiento.service.ReservaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    private final ReservaService service;

    public ReservaController(ReservaService service) {
        this.service = service;
    }

    @PostMapping
    public ReservaHabitacion crear(@RequestBody ReservaHabitacion reserva) {
        return service.guardar(reserva);
    }
}
