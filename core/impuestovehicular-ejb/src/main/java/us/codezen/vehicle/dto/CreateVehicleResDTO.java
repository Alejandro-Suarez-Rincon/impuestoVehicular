package us.codezen.vehicle.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateVehicleResDTO {
    @NotNull
    private Long identification;
    @NotNull
    private Long idCharacteristicsVehicle;
}
