package us.codezen.owner.dto;

import lombok.Data;
import lombok.NonNull;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;

import java.time.LocalDateTime;

@Data
public class QueryOwnerResDTO {
    @NonNull
    private Long identification;
    @NonNull
    private OwnerIdentificationTypeEnum identificationType;
    @NonNull
    private String firstname;
    @NonNull
    private String secondName;
    @NonNull
    private String firstLastName;
    @NonNull
    private String secondLastName;
    @NonNull
    private LocalDateTime bornDate;
    @NonNull
    private Long phone;
    @NonNull
    private String email;
    public QueryOwnerResDTO(Long identification, OwnerIdentificationTypeEnum identificationType, String firstName, String secondName, String firstLastName, String secondLastName, String bornDate, Long phone, String email) {
    }
}
