package us.codezen.report.dto;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class GenerateReportReqDTO {
    @NonNull
    private List listPaidValidity;
    @NonNull
    private List listPendingValidity;
}