package us.codezen.report.dto;

import lombok.Data;
import lombok.NonNull;


@Data
public class GenerateReportResDTO {
    @NonNull
    private String path;
}