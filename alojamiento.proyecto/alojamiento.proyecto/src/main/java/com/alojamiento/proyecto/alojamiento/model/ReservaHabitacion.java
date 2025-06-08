/*package com.alojamiento.proyecto.alojamiento.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Data
@Getter
@Setter


@Entity
public class ReservaHabitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaInicio;
    private LocalDate fechaSalida;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Habitacion habitacion;

    @ManyToOne
    private Piso piso;

    @ManyToMany
    private List<Servicio> servicios;

    // Getters y setters
}*/
package com.alojamiento.proyecto.alojamiento.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class ReservaHabitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaInicio;
    private LocalDate fechaSalida;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Habitacion habitacion;

    @ManyToMany
    private List<Servicio> servicios;
}


