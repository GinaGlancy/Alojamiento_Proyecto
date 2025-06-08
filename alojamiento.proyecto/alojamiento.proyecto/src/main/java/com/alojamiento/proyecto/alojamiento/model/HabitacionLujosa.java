package com.alojamiento.proyecto.alojamiento.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class HabitacionLujosa extends Habitacion {
    private boolean tieneCama;
    private boolean tieneTelevision;
    private boolean tieneBañoPrivado;
    private boolean tieneWifi;
}
