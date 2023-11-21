package us.codezen.appraisal.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class QueryAppraisalReqDTO {
    @NonNull
    private Long id_appraisal;
}
