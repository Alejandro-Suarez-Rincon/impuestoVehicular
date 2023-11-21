package us.codezen.appraisal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import us.codezen.vehicle.entities.VehicleCharacteristics;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@Data
public class Appraisal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_appraisal;

    @Column(name = "value_appraisal", nullable = false)
    private double valueAppraisal;

    @ManyToOne
    @JoinColumn(name = "id_vehicle_characters")
    private VehicleCharacteristics vehicleCharacteristics;
}