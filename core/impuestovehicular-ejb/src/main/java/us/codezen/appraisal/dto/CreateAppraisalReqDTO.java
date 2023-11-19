package us.codezen.appraisal.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class CreateAppraisalReqDTO {
    @NonNull
    private Long id;
    @NonNull
    private String type;
    @NonNull
    private String classVehicle;
    @NonNull
    private String flag;
    @NonNull
    private String line;
    @NonNull
    private String tonnage;
    @NonNull
    private String passengers;
    @NonNull
    private String bodywork;
    @NonNull
    private int cylinderCapacity;
    @NonNull
    private String valueBeforeIva;
    @NonNull
    private String model;
    @NonNull
    private boolean imported;
    @NonNull
    private boolean shielded;
    @NonNull
    private boolean automaticBox;
    @NonNull
    private boolean openCards;
    @NonNull
    private boolean confiscated;
    @NonNull
    private boolean scrapped;
    @NonNull
    private String state;
    @NonNull
    private String domainextecion;
    @NonNull
    private boolean old;
}
