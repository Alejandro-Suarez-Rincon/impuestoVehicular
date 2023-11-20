package us.codezen.vehicle.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateVehicleResDTO {
    @NotNull
    private String idOwner;
    @NotNull
    private String idVehicle;
}
