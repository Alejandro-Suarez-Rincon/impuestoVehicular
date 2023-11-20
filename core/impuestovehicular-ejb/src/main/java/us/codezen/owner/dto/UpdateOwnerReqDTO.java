package us.codezen.owner.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;

import java.time.LocalDateTime;

@Data
public class UpdateOwnerReqDTO {
    @NotNull
    private Long identification;
    @NotNull
    private OwnerIdentificationTypeEnum typeIdentification;
    @NotNull
    private String first_name;
    @NotNull
    private String last_name;
    @NotNull
    private String second_name;
    @NotNull
    private String second_last_name;
    @NotNull
    private LocalDateTime born_date;
    @NotNull
    private Long phone;
    @NotNull
    private String email;
}
