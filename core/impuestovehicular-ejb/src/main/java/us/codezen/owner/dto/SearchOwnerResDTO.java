package us.codezen.owner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class SearchOwnerResDTO{
    private Long identification;
    private String typeIdentification;
    private String first_name;
    private String last_name;
    private String second_name;
    private String second_last_name;
    private LocalDateTime born_date;
    private Long phone;
    private String email;
}