package us.codezen.appraisal.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateAppraisalResDTO implements Serializable {
    @NonNull
    private Long id_appraisal;
    @NonNull
    private double valueAppraisal;
}
