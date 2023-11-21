package us.codezen.vehicle.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SearchVehicleReqDTO {
    @NotNull
    private Long idCharacteristicsVehicle;
}
