package us.codezen.vehicle.entities;

import jakarta.persistence.*;
import lombok.Data;
import us.codezen.vehicle.enums.VehicleTypeServiceEnum;

@Entity
@Data
public class Vehicle {
    @Id
    private String plate;

    @Column(name = "type_service", nullable = false)
    @Enumerated(EnumType.STRING)
    private VehicleTypeServiceEnum typeService;

}
