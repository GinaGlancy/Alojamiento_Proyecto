package com.alojamiento.proyecto.alojamiento.service;

import com.alojamiento.proyecto.alojamiento.model.HabitacionNormal;
import com.alojamiento.proyecto.alojamiento.repository.HabitacionNormalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabitacionNormalService {
    private final HabitacionNormalRepository repository;

    public HabitacionNormalService(HabitacionNormalRepository repository) {
        this.repository = repository;
    }

    public HabitacionNormal guardar(HabitacionNormal h) {
        return repository.save(h);
    }

    public List<HabitacionNormal> listar() {
        return repository.findAll();
    }

    public Optional<HabitacionNormal> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
