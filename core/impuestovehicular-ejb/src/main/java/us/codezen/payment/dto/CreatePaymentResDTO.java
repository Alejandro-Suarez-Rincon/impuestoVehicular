package us.codezen.payment.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreatePaymentResDTO {
    @NotNull
    private String message;

}