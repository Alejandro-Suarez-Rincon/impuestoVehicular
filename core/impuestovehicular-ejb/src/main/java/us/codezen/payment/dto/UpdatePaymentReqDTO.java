package us.codezen.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
@Getter
@Setter

public class UpdatePaymentReqDTO implements Serializable {

    private String plate;
    private int payAge;
    private String entity;
    private Long number_transaction;
    private Date date_payment;
}