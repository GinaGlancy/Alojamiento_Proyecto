package com.alojamiento.proyecto.alojamiento.service;

import com.alojamiento.proyecto.alojamiento.model.Cliente;
import com.alojamiento.proyecto.alojamiento.model.Habitacion;
import com.alojamiento.proyecto.alojamiento.model.ReservaHabitacion;
import com.alojamiento.proyecto.alojamiento.model.Servicio;
import com.alojamiento.proyecto.alojamiento.repository.ClienteRepository;
import com.alojamiento.proyecto.alojamiento.repository.HabitacionRepository;
import com.alojamiento.proyecto.alojamiento.repository.ReservaRepository;
import com.alojamiento.proyecto.alojamiento.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ReservaService {


    @Autowired
    private ReservaRepository repository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private HabitacionRepository habitacionRepository;

    @Autowired
    private ServicioRepository servicioRepository;

    public ReservaHabitacion guardar(ReservaHabitacion r) {
        // Obtener Cliente
        Cliente cliente = clienteRepository.findById(r.getCliente().getId()).orElseThrow();
        r.setCliente(cliente);

        // Obtener Habitacion
        Habitacion habitacion = habitacionRepository.findById(r.getHabitacion().getId()).orElseThrow();
        r.setHabitacion(habitacion);

        // Reemplazar Servicios por los que vienen desde la base de datos
        if (r.getServicios() != null && !r.getServicios().isEmpty()) {
            List<Servicio> serviciosCompletos = r.getServicios().stream()
                    .map(s -> servicioRepository.findById(s.getId())
                            .orElseThrow(() -> new RuntimeException("Servicio no encontrado con ID: " + s.getId())))
                    .toList();
            r.setServicios(serviciosCompletos);
        }

        return repository.save(r);
    }
}