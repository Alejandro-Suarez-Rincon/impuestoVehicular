package us.codezen.payment.dto;

import lombok.Data;

import java.time.LocalDateTime;


@Data

public class QueryPaymentResDTO {
    private String plate;
    private Long identification;
    private LocalDateTime date_payment;
    private double discount;

    private double late_payment;
    private double appraisal;
}