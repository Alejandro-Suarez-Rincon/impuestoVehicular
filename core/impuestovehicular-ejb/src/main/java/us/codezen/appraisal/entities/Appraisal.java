package us.codezen.appraisal.entities;

import jakarta.persistence.*;
import lombok.Data;
import us.codezen.vehicle.entities.Vehicle;

import java.time.LocalDate;

@Entity
@Data
public class Appraisal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_appraisal;

    @Column(name = "value_appraisal", nullable = false)
    private double valueAppraisal;
}