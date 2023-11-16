package us.codezen.payment.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class QueryPaymentReqDTO implements Serializable {
    private String plate;
}