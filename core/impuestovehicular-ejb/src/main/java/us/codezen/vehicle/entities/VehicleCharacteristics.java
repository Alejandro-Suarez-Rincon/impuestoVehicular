package us.codezen.vehicle.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class VehicleCharacteristics {
    @Id
    @GeneratedValue
    @NonNull
    private Long idCharacteristicsVehicle;

    @NonNull
    @Column(name = "trademark", length = 150, nullable = false)
    private String trademark;

    @NonNull
    @Column(name = "line", length = 100, nullable = false)
    private String line;

    @NonNull
    @Column(name = "type", length = 100, nullable = false)
    private String type;

    @NonNull
    @Column(name = "class_vehicle", length = 100, nullable = false)
    private String classVehicle;

    @NonNull
    @Column(name = "value_iva", nullable = true)
    private double valueIva;

    @NonNull
    @Column(name = "ancient", length = 50, nullable = false)
    private String ancient;

    @NonNull
    @Column(name = "model", length = 100, nullable = false)
    private String model;

    @NonNull
    @Column(name = "bodywork", length = 50, nullable = true)
    private String bodywork;

    @NonNull
    @Column(name = "cylinder_capacity", nullable = false)
    private int cylinderCapacity;

    @NonNull
    @Column(name = "tonnage", nullable = false)
    private Long tonnage;

    @NonNull
    @Column(name = "passengers", nullable = false)
    private int passengers;

    @NonNull
    @Column(name = "imported", nullable = true)
    private boolean imported;

    @NonNull
    @Column(name = "armored", nullable = true)
    private boolean armored;

    @NonNull
    @Column(name = "automatic_box", nullable = true)
    private boolean automaticBox;

    @NonNull
    @Column(name = "stolen", nullable = true)
    private boolean stolen;

    @NonNull
    @Column(name = "confiscated", nullable = true)
    private boolean confiscated;

    @NonNull
    @Column(name = "scrapped", nullable = true)
    private boolean scrapped;

    @NonNull
    @Column(name = "state", length = 50, nullable = true)
    private String state;

    @NonNull
    @Column(name = "domain_extension", length = 50, nullable = true)
    private String domainExtension;

    @NonNull
    @Column(name = "openLetters", length = 100, nullable = false)
    private String openLetters;
}
