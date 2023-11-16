package us.codezen.payment.dto;

import lombok.Data;
import us.codezen.payment.PaymentEnums.PaymentStateType;
import us.codezen.payment.PaymentEnums.PaymentTypeAccount;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data

public class UpdatePaymentReqDTO implements Serializable {

    private String plate;
    private int payAge;
    private String bankEntity;
    private Long bankNumberTransaction;
    private LocalDateTime paidDate;
    private double value;
    private double lateValue;
    private double discountValue;
    private LocalDateTime lateDate;
    private PaymentStateType state;
    private PaymentTypeAccount bankAccountType;
    private LocalDateTime cratedDate;

}