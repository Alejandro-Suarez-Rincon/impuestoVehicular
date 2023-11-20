package us.codezen.report.dto;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
public class CalculateReportReqDTO {
    @NonNull
    private String type;
    @NonNull
    private String classVehicle;
    @NonNull
    private String brand;
    @NonNull
    private String line;
    @NonNull
    private String model;
    @NonNull
    private Long cubucCapacity;
    @NonNull
    private LocalDateTime yearAppraisal;
    @NonNull
    private LocalDateTime liquidationDate;
}