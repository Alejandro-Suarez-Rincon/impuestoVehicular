package us.codezen.payment.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import us.codezen.payment.enums.PaymentStateType;
import us.codezen.payment.enums.PaymentTypeAccount;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data

public class UpdatePaymentReqDTO implements Serializable {
    @NotNull
    private String plate;
    @NotNull
    private int payAge;
    @NotNull
    private String bankEntity;
    @NotNull
    private Long bankNumberTransaction;
    @NotNull
    private LocalDateTime paidDate;
    @NotNull
    private double value;
    @NotNull
    private double lateValue;
    @NotNull
    private double discountValue;
    @NotNull
    private LocalDateTime lateDate;
    @NotNull
    private PaymentStateType state;
    @NotNull
    private PaymentTypeAccount bankAccountType;
    @NotNull
    private LocalDateTime cratedDate;
}
