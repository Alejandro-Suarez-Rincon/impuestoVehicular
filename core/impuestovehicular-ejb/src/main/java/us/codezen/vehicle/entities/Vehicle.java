package us.codezen.vehicle.entities;

import jakarta.persistence.*;
import lombok.Data;
import us.codezen.owner.entities.Owner;

import java.time.LocalDate;

@Entity
@Table(name = "vehicle")
@Data
public class Vehicle {
    @Id
    @Column(name = "placa")
    private String placa;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "cilindraje")
    private String cilindraje;
    @Column(name = "fecha_matricula")
    private LocalDate fechaMatricula;
    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Owner owner;
}