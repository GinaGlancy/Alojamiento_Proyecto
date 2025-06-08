package com.alojamiento.proyecto.alojamiento.service;


import com.alojamiento.proyecto.alojamiento.model.Piso;
import com.alojamiento.proyecto.alojamiento.repository.PisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PisoService {

    @Autowired
    private PisoRepository pisoRepository;

    public List<Piso> listarTodos() {
        return pisoRepository.findAll();
    }

    public Optional<Piso> obtenerPorId(Long id) {
        return pisoRepository.findById(id);
    }

    public Piso guardar(Piso piso) {
        return pisoRepository.save(piso);
    }

    public void eliminar(Long id) {
        pisoRepository.deleteById(id);
    }
}
