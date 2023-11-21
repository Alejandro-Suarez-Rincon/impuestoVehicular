package us.codezen.vehicle.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

@Data
public class QueryVehicleReqDTO {
    @NonNull
    private String plate;
}
