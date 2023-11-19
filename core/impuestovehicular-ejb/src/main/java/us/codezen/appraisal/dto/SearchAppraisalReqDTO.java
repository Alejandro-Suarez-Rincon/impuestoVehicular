package us.codezen.appraisal.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class SearchAppraisalReqDTO {
    @NonNull
    private Long id;
    @NonNull
    private String type;
    @NonNull
    private String classVehicle;
    @NonNull
    private String trademark;
    @NonNull
    private String line;
    @NonNull
    private String tonnage;
    @NonNull
    private String bodywork;
    @NonNull
    private String displacement;
    @NonNull
    private String vatValue;
    @NonNull
    private String model;
    @NonNull
    private boolean imported;
    @NonNull
    private boolean shielded;
    @NonNull
    private boolean automaticBox;
    @NonNull
    private boolean openLetters;
    @NonNull
    private boolean scrapped;
    @NonNull
    private String state;
    @NonNull
    private String domainextension;
    @NonNull
    private boolean old;
    @NonNull
    private String vehicleType;
    @NonNull
    private String passengers;
    @NonNull
    private String stolen;
}
