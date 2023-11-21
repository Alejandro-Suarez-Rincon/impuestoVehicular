package us.codezen.appraisal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import us.codezen.vehicle.entities.VehicleCharacteristics;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QueryAppraisalResDTO implements Serializable {
    @NonNull
    private Long id_appraisal;
    @NonNull
    private double valueAppraisal;
    @NonNull
    private VehicleCharacteristics vehicleCharacteristics;
}
