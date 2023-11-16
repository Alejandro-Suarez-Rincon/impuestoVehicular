package us.codezen.payment.dto;

import lombok.Data;

import java.time.LocalDateTime;


@Data

public class QueryPaymentResDTO {
    private String plate;
    private Long identification;
    private LocalDateTime datePayment;
    private double discount;
    private double lateValue;
    private double value;
}