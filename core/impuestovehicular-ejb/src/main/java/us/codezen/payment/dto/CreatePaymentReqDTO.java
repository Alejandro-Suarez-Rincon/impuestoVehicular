package us.codezen.payment.dto;

import lombok.Data;

import java.io.Serializable;

@Data

public class CreatePaymentReqDTO implements Serializable {

    private String plate;
    private int payAge;
}