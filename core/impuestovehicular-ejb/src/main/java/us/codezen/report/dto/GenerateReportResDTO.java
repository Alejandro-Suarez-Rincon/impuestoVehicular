package us.codezen.report.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class GenerateReportResDTO {
    // Generar el pdf
    @NonNull
    private String path;
}