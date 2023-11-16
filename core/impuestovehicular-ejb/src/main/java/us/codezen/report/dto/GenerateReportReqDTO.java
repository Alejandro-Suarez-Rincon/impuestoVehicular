package us.codezen.report.dto;

import lombok.Data;

import java.util.List;

@Data
public class GenerateReportReqDTO {
    private List listPaidValidity;
    private List listPendingValidity;
}