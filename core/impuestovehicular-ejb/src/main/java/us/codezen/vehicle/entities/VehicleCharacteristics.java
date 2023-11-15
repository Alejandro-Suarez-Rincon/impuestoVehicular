package us.codezen.vehicle.entities;

import jakarta.persistence.*;
import lombok.Data;

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
    @Column(name = "value_iva", nullable = false)
    private double valueIva;
    @Column(name = "ancient", length = 50, nullable = false)
    private String ancient;
    @Column(name = "model", length = 100, nullable = false)
    private String model;
    @Column(name = "bodywork", length = 50, nullable = false)
    private String bodywork;
    @Column(name = "cylinder_capacity", nullable = false)
    private int cylinderCapacity;
    @Column(name = "tonnage", nullable = false)
    private Long tonnage;
    @Column(name = "passengers", nullable = false)
    private int passengers;
    @Column(name = "imported", length = 50, nullable = false)
    private String imported;
    @Column(name = "armored", length = 50, nullable = false)
    private String armored;
    @Column(name = "automatic_box", length = 50, nullable = false)
    private String automaticBox;
    @Column(name = "open_letters", length = 50, nullable = false)
    private String openLetters;
    @Column(name = "stolen", length = 50, nullable = false)
    private String stolen;
    @Column(name = "confiscated", length = 50, nullable = false)
    private String confiscated;
    @Column(name = "scrapped", length = 50, nullable = false)
    private String scrapped;
    @Column(name = "state", length = 50, nullable = false)
    private String state;
    @Column(name = "domain_extension", length = 50, nullable = false)
    private String domainExtension;
}