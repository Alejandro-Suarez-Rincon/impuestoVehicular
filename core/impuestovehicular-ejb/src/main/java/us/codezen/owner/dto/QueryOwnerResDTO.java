package us.codezen.owner.dto;

import lombok.Data;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;

import java.time.LocalDateTime;

@Data
public class QueryOwnerResDTO {

    private Long identification;
    private OwnerIdentificationTypeEnum typeIdentification;
    private String first_name;
    private String last_name;
    private String second_name;
    private String second_last_name;
    private LocalDateTime born_date;
    private Long phone;
    private String email;
}
