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
public class SearchOwnerResDTO implements Serializable{
    @NonNull
    private Long identification;
    @NonNull
    private OwnerIdentificationTypeEnum typeIdentification;
    @NonNull
    private String first_name;
    @NonNull
    private String last_name;
    @NonNull
    private String second_name;
    @NonNull
    private String second_last_name;
    @NonNull
    private LocalDateTime born_date;
    @NonNull
    private String phone;
    @NonNull
    private String email;
}
