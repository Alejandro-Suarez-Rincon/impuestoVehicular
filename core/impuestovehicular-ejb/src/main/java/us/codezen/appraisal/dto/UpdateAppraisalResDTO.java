package us.codezen.appraisal.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import us.codezen.vehicle.entities.VehicleCharacteristics;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateAppraisalResDTO implements Serializable {
    @NonNull
    private Long id_appraisal;
    @NonNull
    private double valueAppraisal;
    @NonNull
    private VehicleCharacteristics vehicleCharacteristics;
}
