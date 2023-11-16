package us.codezen.payment.dto;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class CalculateLatePaymentReqDTO implements Serializable {
    private String plate;
    private LocalDateTime date_payment;
}