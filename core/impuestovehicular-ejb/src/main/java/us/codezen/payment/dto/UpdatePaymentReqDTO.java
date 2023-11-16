package us.codezen.payment.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data

public class UpdatePaymentReqDTO implements Serializable {

    private String plate;
    private int payAge;
    private String bank_entity;
    private Long bank_number_transaction;
    private LocalDateTime paid_date;
    private double value;
    private double late_value;
    private double discount_value;
    private LocalDateTime late_date;
    private boolean state;
    private LocalDateTime crated_date;

}