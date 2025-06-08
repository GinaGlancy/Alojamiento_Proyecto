package com.alojamiento.proyecto.alojamiento.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import lombok.Data;
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "tipo"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = HabitacionSencilla.class, name = "sencilla"),
        @JsonSubTypes.Type(value = HabitacionNormal.class, name = "normal"),
        @JsonSubTypes.Type(value = HabitacionLujosa.class, name = "lujosa")
})

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double precio;

    @ManyToOne
    @JoinColumn(name = "piso_id")
    @JsonBackReference
    private Piso piso;
}