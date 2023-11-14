package us.codezen.report.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Date;

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
    private long cubucCapacity;

    @NonNull
    private Date yearAppraisal;

    @NonNull
    private Date liquidationDate;
}