package us.codezen.vehicle.entities;

import jakarta.persistence.*;
import lombok.Data;
import us.codezen.appraisal.entities.Appraisal;

import java.util.List;

@Entity
@Data
public class VehicleCharacteristics {
    @Id
    @GeneratedValue
    private Long id;
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

    @ManyToOne
    @JoinColumn(name = "plate_vehicle")
    private Vehicle vehicle;

    @OneToMany(mappedBy = "vehicleCharacteristics")
    private List<Appraisal> appraisals;
}