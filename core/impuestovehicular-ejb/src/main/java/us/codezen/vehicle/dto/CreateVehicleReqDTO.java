package us.codezen.vehicle.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateVehicleReqDTO implements Serializable {
    @NonNull
    private String plate;

    @NonNull
    private Long identification;

    @NonNull
    private String trademark;

    @NonNull
    private String line;

    @NonNull
    private String type;

    @NonNull
    private String classVehicle;

    @NonNull
    private double valueIva;

    @NonNull
    private String ancient;

    @NonNull
    private String model;

    @NonNull
    private String bodywork;

    @NonNull
    private int cylinderCapacity;

    @NonNull
    private Long tonnage;

    @NonNull
    private int passengers;

    @NonNull
    private boolean imported;

    @NonNull
    private boolean armored;

    @NonNull
    private boolean automaticBox;

    @NonNull
    private boolean stolen;

    @NonNull
    private boolean confiscated;

    @NonNull
    private boolean scrapped;

    @NonNull
    private String state;

    @NonNull
    private String domainExtension;

    @NonNull
    private String openLetters;
}
