package us.codezen.appraisal.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class SearchAppraisalReqDTO {
    @NonNull
    private Long id_appraisal;
}
