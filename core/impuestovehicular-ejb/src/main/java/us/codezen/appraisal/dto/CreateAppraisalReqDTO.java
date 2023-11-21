package us.codezen.appraisal.dto;

import lombok.Data;
import lombok.NonNull;
import us.codezen.vehicle.entities.VehicleCharacteristics;

@Data
public class CreateAppraisalReqDTO {
    @NonNull
    private Long id_appraisal;
    @NonNull
    private double valueAppraisal;
    @NonNull
    private VehicleCharacteristics vehicleCharacteristics;
}
