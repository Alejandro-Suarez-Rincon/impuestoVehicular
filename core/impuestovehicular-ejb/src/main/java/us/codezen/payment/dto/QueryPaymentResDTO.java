package us.codezen.payment.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;


@Data

public class QueryPaymentResDTO {
    @NotNull
    private String plate;
    @NotNull
    private Long identification;
    @NotNull
    private LocalDateTime datePayment;
    @NotNull
    private double discount;
    @NotNull
    private double lateValue;
    @NotNull
    private double value;
}