package us.codezen.owner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;

@AllArgsConstructor
@Data

public class CreateOwnerResDTO {
    @NonNull
    private String message;


    public CreateOwnerResDTO(Long identification, OwnerIdentificationTypeEnum identificationType, String firstName, String secondName, String firstLastName, String secondLastName, String bornDate, Long phone, String email) {
    }
}
