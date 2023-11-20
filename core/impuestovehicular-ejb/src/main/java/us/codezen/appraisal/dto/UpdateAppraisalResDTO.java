package us.codezen.appraisal.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateAppraisalResDTO {
    @NotNull
    private Long id;
    @NotNull
    private String type;
    @NotNull
    private String classVehicle;
    @NotNull
    private String flag;
    @NotNull
    private String line;
    @NotNull
    private String tonnage;
    @NotNull
    private String passengers;
    @NotNull
    private String bodywork;
    @NotNull
    private int cylinderCapacity;
    @NotNull
    private String valueBeforeIva;
}
