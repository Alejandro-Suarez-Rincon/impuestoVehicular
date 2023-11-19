package us.codezen.vehicle.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class QueryVehicleReqDTO {
    @NotNull
    private String plate;
}
