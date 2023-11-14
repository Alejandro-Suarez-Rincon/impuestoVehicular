package us.codezen.report.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GenerateReportReqDTO {
    @NonNull
    private List listPaidValidity;

    @NonNull
    private List listPendingValidity;
}