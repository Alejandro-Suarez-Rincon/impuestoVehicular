package us.codezen.payment.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CalculateLatePaymentReqDTO implements Serializable {
    private String plate;
    private Date date_payment;
}