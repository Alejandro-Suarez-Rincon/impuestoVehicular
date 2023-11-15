package us.codezen.payment.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data

public class UpdatePaymentReqDTO implements Serializable {

    private String plate;
    private int payAge;
    private String entity;
    private Long number_transaction;
    private LocalDateTime date_payment;
}