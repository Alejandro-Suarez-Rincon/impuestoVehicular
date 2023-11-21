package us.codezen.appraisal.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import us.codezen.vehicle.entities.VehicleCharacteristics;

@Data
public class UpdateAppraisalReqDTO {
    @NonNull
    private Long id_appraisal;
    @NonNull
    private double valueAppraisal;
    @NonNull
    private VehicleCharacteristics vehicleCharacteristics;

}
