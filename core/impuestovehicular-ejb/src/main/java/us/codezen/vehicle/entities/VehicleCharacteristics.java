package us.codezen.vehicle.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class VehicleCharacteristics {
    @Id
    @GeneratedValue
    private Long idCharacteristicsVehicle;
    @Column(name = "identification", nullable = false)
    private Long identification;
    @Column(name = "trademark", length = 150, nullable = false)
    private String trademark;
    @Column(name = "line", length = 100, nullable = false)
    private String line;
    @Column(name = "type", length = 100, nullable = false)
    private String type;
    @Column(name = "class_vehicle", length = 100, nullable = false)
    private String classVehicle;
    @Column(name = "value_iva", nullable = true)
    private double valueIva;
    @Column(name = "ancient", length = 50, nullable = false)
    private String ancient;
    @Column(name = "model", length = 100, nullable = false)
    private String model;
    @Column(name = "bodywork", length = 50, nullable = true)
    private String bodywork;
    @Column(name = "cylinder_capacity", nullable = false)
    private int cylinderCapacity;
    @Column(name = "tonnage", nullable = false)
    private Long tonnage;
    @Column(name = "passengers", nullable = false)
    private int passengers;
    @Column(name = "imported", nullable = true)
    private boolean imported;
    @Column(name = "armored", nullable = true)
    private boolean armored;
    @Column(name = "automatic_box", nullable = true)
    private boolean automaticBox;
    @Column(name = "stolen", nullable = true)
    private boolean stolen;
    @Column(name = "confiscated", nullable = true)
    private boolean confiscated;
    @Column(name = "scrapped", nullable = true)
    private boolean scrapped;
    @Column(name = "state", length = 50, nullable = true)
    private String state;
    @Column(name = "domain_extension", length = 50, nullable = true)
    private String domainExtension;
    @Column(name = "openLetters", length = 100, nullable = false)
    private String openLetters;


    public VehicleCharacteristics(
            Long idCharacteristicsVehicle,
            Long identification,
            String trademark,
            String line,
            String type,
            String classVehicle,
            double valueIva,
            String ancient,
            String model,
            String bodywork,
            int cylinderCapacity,
            Long tonnage,
            int passengers,
            boolean imported,
            boolean armored,
            boolean automaticBox,
            boolean stolen,
            boolean confiscated,
            boolean scrapped,
            String state,
            String domainExtension,
            String openLetters
    ) {
        this.idCharacteristicsVehicle = idCharacteristicsVehicle;
        this.identification = identification;
        this.trademark = trademark;
        this.line = line;
        this.type = type;
        this.classVehicle = classVehicle;
        this.valueIva = valueIva;
        this.ancient = ancient;
        this.model = model;
        this.bodywork = bodywork;
        this.cylinderCapacity = cylinderCapacity;
        this.tonnage = tonnage;
        this.passengers = passengers;
        this.imported = imported;
        this.armored = armored;
        this.automaticBox = automaticBox;
        this.stolen = stolen;
        this.confiscated = confiscated;
        this.scrapped = scrapped;
        this.state = state;
        this.domainExtension = domainExtension;
        this.openLetters = openLetters;
    }


}