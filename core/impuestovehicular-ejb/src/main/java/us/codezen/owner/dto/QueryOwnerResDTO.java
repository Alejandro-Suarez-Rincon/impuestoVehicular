package us.codezen.owner.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;

import java.time.LocalDateTime;

@Data
public class QueryOwnerResDTO {
    @NotNull
    private Long identification;
    @NotNull
    private OwnerIdentificationTypeEnum identificationType;
    @NotNull
    private String firstname;
    @NotNull
    private String secondName;
    @NotNull
    private String firstLastName;
    @NotNull
    private String secondLastName;
    @NotNull
    private LocalDateTime bornDate;
    @NotNull
    private Long phone;
    @NotNull
    private String email;

    public QueryOwnerResDTO(Long identification, OwnerIdentificationTypeEnum identificationType, String firstName, String secondName, String firstLastName, String secondLastName, String bornDate, Long phone, String email) {
    }
}
