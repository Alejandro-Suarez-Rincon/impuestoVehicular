package us.codezen.vehicle.entities;

import jakarta.persistence.*;
import lombok.Data;
import us.codezen.owner.entities.Owner;
import us.codezen.payment.entities.Payment;
import us.codezen.vehicle.enums.VehicleTypeServiceEnum;

import java.util.List;

@Entity
@Data
public class Vehicle {
    @Id
    private String plate;

    @Column(name = "type_service", nullable = false)
    @Enumerated(EnumType.STRING)
    private VehicleTypeServiceEnum typeService;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToMany(mappedBy = "vehicle")
    private List<VehicleCharacteristics> vehicleCharacteristics;

    @OneToMany(mappedBy = "vehicle")
    private List<Payment> payments;

}
