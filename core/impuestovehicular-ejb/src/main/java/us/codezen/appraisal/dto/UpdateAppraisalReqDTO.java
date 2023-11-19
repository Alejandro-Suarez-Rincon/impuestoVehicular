package us.codezen.appraisal.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateAppraisalReqDTO {
    @NotNull
    private String type;
    @NotNull
    private String classVehicle;
    @NotNull
    private String ancient;
    @NotNull
    private String armored;
    @NotNull
    private String trademarrk;
    @NotNull
    private String line;
    @NotNull
    private String tonnage;
    @NotNull
    private String bodywork;
    @NotNull
    private int cylinderCapacity;
    @NotNull
    private String vatValue;
    @NotNull
    private String model;
    @NotNull
    private boolean imported;
    @NotNull
    private boolean shielded;
    @NotNull
    private boolean automaticBox;
    @NotNull
    private boolean openLetters;
    @NotNull
    private boolean scrapped;
    @NotNull
    private String state;
    @NotNull
    private String domainextension;
    @NotNull
    private boolean old;
    @NotNull
    private String vehicleType;
    @NotNull
    private String passengers;
    @NotNull
    private String confiscated;
    @NotNull
    private String stolen;

}
