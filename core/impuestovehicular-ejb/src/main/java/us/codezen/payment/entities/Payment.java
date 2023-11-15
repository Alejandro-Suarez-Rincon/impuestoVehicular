package us.codezen.payment.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "entity", length = 100, nullable = false)
    private String entity;
    @Column(name = "pay_age", nullable = false)
    private int payAge;
    @Column(name = "number_transaction", nullable = false)
    private Long numberTransaction;
    @Column(name = "date_payment", nullable = false)
    private LocalDateTime datePayment;
    @Column(name = "value", nullable = false)
    private double value;
    @Column(name = "state", length = 50, nullable = false)
    private String state;
}