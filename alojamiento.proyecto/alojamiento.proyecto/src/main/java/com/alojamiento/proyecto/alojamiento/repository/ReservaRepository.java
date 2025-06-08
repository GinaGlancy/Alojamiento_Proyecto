package com.alojamiento.proyecto.alojamiento.repository;


import com.alojamiento.proyecto.alojamiento.model.ReservaHabitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<ReservaHabitacion, Long> {
}
