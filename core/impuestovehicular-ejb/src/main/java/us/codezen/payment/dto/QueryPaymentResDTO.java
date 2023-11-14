package us.codezen.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor

public class QueryPaymentResDTO{
    private String plate;
    private Long identification;
    private Date date_payment;
    private double discount;

    private double late_payment;
    private double appraisal;
}