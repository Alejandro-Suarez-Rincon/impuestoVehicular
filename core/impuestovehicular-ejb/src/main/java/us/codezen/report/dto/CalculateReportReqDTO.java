package us.codezen.report.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CalculateReportReqDTO implements Serializable {

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