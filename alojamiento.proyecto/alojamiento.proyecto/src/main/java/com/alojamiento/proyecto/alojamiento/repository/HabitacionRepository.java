package com.alojamiento.proyecto.alojamiento.repository;

import com.alojamiento.proyecto.alojamiento.model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitacionRepository extends JpaRepository<Habitacion, Long> {
}
