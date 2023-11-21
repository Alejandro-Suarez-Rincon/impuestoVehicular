package us.codezen.vehicle.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

@Data
public class UpdateVehicleResDTO {
    @NonNull
    private String idOwner;
    @NonNull
    private String idVehicle;
}
