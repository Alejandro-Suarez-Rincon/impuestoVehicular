package us.codezen.payment.dto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter

public class CreatePaymentReqDTO implements Serializable {

    private String plate;
    private int payAge;
}