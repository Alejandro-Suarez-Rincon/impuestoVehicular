package us.codezen.owner.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;

@AllArgsConstructor
@Data

public class CreateOwnerResDTO {
    @NotNull
    private String message;


    public CreateOwnerResDTO(Long identification, OwnerIdentificationTypeEnum identificationType, String firstName, String secondName, String firstLastName, String secondLastName, String bornDate, Long phone, String email) {
    }
}
