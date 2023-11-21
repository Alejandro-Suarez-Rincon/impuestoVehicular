package us.codezen.appraisal.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

@Data
public class CreateAppraisalResDTO {
    @NonNull
    private Long id_appraisal;
    @NonNull
    private double valueAppraisal;
}
