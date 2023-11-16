package us.codezen.report.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class CalculateReportResDTO {
    private List listPaidValidity;
    private List listPendingValidity;
}