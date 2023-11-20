package us.codezen.payment.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CalculateLatePaymentResDTO {
    @NotNull
    public double latePayment;
}