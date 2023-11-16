package us.codezen.owner.dto;


import lombok.Data;
import java.time.LocalDateTime;
@Data
public class CreateOwnerReqDTO{

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