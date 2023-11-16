package us.codezen.vehicle.entities;

import jakarta.persistence.*;
import lombok.Data;
import us.codezen.owner.entities.Owner;

import java.time.LocalDate;

@Entity
@Data
public class Vehicle {
    @Id
    @GeneratedValue
    private String plate;

    @Column(name = "type_Service", nullable = false)
    private boolean typeService;

}