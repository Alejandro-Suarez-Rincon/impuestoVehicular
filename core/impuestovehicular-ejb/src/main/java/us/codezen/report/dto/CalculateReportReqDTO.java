package us.codezen.report.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CalculateReportReqDTO {
    private String type;
    private String classVehicle;
    private String brand;
    private String line;
    private String model;
    private Long cubucCapacity;
    private LocalDateTime yearAppraisal;
    private LocalDateTime liquidationDate;
}