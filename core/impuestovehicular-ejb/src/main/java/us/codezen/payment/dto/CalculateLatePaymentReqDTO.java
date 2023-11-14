package us.codezen.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter

public class CalculateLatePaymentReqDTO implements Serializable {
    private String plate;

    private Date date_payment;
}