package us.codezen.report.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CalculateReportResDTO implements Serializable {
    @NonNull
    private List listPaidValidity;
    @NonNull
    private List listPendingValidity;
}