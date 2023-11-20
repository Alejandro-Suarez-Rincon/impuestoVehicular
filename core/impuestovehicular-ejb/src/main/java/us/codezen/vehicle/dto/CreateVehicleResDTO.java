package us.codezen.vehicle.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateVehicleResDTO {
    @NotNull
    private String idOwner;
    @NotNull
    private String idVehicle;
}
