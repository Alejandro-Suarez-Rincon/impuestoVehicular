package us.codezen.vehicle.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class UpdateVehicleResDTO {
    @NonNull
    private Long identification;

    @NonNull
    private Long idCharacteristicsVehicle;
}
