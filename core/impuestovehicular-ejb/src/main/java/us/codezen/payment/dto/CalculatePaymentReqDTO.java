package us.codezen.payment.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CalculatePaymentReqDTO implements Serializable {
    @NotNull
    private String plate;
    @NotNull
    private LocalDateTime datePayment;
}