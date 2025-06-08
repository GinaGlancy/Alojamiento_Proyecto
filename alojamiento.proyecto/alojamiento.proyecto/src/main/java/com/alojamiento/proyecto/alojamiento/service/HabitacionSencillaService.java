package com.alojamiento.proyecto.alojamiento.service;

import com.alojamiento.proyecto.alojamiento.model.HabitacionSencilla;
import com.alojamiento.proyecto.alojamiento.repository.HabitacionSencillaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionSencillaService {

    @Autowired
    private HabitacionSencillaRepository repository;

    public HabitacionSencilla crear(HabitacionSencilla habitacion) {
        return repository.save(habitacion);
    }

    public List<HabitacionSencilla> listar() {
        return repository.findAll();
    }
}
