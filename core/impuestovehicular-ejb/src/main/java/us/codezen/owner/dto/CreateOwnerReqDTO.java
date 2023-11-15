package us.codezen.owner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class CreateOwnerReqDTO{

        private int identification;
        private String firstName;
        private String secondName;
        private String firstLastName;
        private String SecondLastName;
        private LocalDateTime birthday;
        private int phone;
        private String email;
        private String typeIdentification;
}