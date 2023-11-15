package us.codezen.appraisal.entities;

import jakarta.persistence.*;
import lombok.Data;
import us.codezen.vehicle.entities.Vehicle;

import java.time.LocalDate;

@Entity
@Table(name = "appraisal")
@Data
public class Appraisal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_appraisal")
    private long id_appraisal;
    @Column(name = "value_appraisal")
    private double valueAppraisal;
    @Column(name = "capacity_Cilindet")
    private int capacityCilinder;
    @Column(name = "line")
    private String line;
    @Column(name = "brand")
    private String brand;
    @ManyToOne
    @JoinColumn(name = "placa")
    private Vehicle vehicle;

}