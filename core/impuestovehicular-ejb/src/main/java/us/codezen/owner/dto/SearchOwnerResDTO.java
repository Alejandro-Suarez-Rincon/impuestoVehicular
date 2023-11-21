package us.codezen.owner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;

import java.io.Serializable;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SearchOwnerResDTO implements Serializable {
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
}
