package com.alojamiento.proyecto.alojamiento.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class HabitacionSencilla extends Habitacion {
    private boolean tieneCama;
    private boolean tieneTelevision;
}

