package us.codezen.report.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class CalculateReportResDTO {
    @NonNull
    private List listPaidValidity;

    @NonNull
    private List listPendingValidity;
}