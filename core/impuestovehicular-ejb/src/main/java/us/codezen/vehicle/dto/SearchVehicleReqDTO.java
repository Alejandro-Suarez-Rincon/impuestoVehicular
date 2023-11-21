package us.codezen.vehicle.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class SearchVehicleReqDTO {
    @NonNull
    private String plate;
}
