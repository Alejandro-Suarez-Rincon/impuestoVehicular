package us.codezen.vehicle.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import us.codezen.vehicle.enums.VehicleTypeServiceEnum;

@Data
public class CreateVehicleReqDTO {
    @NotNull
    private Long idCharacteristicsVehicle;
    @NotNull
    private Long identification;
    @NotNull
    private String trademark;
    @NotNull
    private String line;
    @NotNull
    private String type;
    @NotNull
    private String classVehicle;
    @NotNull
    private double valueIva;
    @NotNull
    private String ancient;
    @NotNull
    private String model;
    @NotNull
    private String bodywork;
    @NotNull
    private int cylinderCapacity;
    @NotNull
    private Long tonnage;
    @NotNull
    private int passengers;
    @NotNull
    private boolean imported;
    @NotNull
    private boolean armored;
    @NotNull
    private boolean automaticBox;
    @NotNull
    private boolean stolen;
    @NotNull
    private boolean confiscated;
    @NotNull
    private boolean scrapped;
    @NotNull
    private String state;
    @NotNull
    private String domainExtension;
    @NotNull
    private String openLetters;
}