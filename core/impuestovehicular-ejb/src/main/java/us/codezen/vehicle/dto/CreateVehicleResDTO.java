package us.codezen.vehicle.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateVehicleResDTO implements Serializable {
    @NonNull
    private Long idCharacteristicsVehicle;
}
