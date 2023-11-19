package us.codezen.appraisal.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SearchAppraisalReqDTO {
    @NotNull
    private Long id;
}
