package com.alojamiento.proyecto.alojamiento.service;

import com.alojamiento.proyecto.alojamiento.model.HabitacionLujosa;
import com.alojamiento.proyecto.alojamiento.repository.HabitacionLujosaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabitacionLujosaService {
    private final HabitacionLujosaRepository repository;

    public HabitacionLujosaService(HabitacionLujosaRepository repository) {
        this.repository = repository;
    }

    public HabitacionLujosa guardar(HabitacionLujosa h) {
        return repository.save(h);
    }

    public List<HabitacionLujosa> listar() {
        return repository.findAll();
    }

    public Optional<HabitacionLujosa> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
