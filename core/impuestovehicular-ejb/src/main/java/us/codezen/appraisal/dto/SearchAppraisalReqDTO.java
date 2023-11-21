package us.codezen.appraisal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchAppraisalReqDTO implements Serializable {
    @NonNull
    private Long id_appraisal;
}
