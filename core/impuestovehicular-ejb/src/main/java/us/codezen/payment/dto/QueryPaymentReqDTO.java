package us.codezen.payment.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class QueryPaymentReqDTO implements Serializable {
    @NotNull
    private String plate;
}