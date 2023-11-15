package us.codezen.report.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
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