package us.codezen.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter


public class CalculatePaymentReqDTO implements Serializable {

    private String plate;

    private Date date_payment;
}