package us.codezen.payment.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import us.codezen.payment.enums.PaymentStateType;
import us.codezen.payment.enums.PaymentTypeAccount;

import java.time.LocalDateTime;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "bank_entity", length = 100, nullable = true)
    private String bankEntity;

    @Column(name = "bank_account_type", nullable = true)
    @Enumerated(EnumType.STRING)
    private PaymentTypeAccount bankAccountType;

    @Column(name = "pay_age", nullable = false)
    private int payAge;
    @Column(name = "late_value", nullable = true)
    private double lateValue;
    @Column(name = "discount_value", nullable = true)
    private double discountValue;
    @Column(name = "late_date", nullable = true)
    private LocalDateTime lateDate;
    @Column(name = "bank_number_transaction", nullable = true)
    private Long bankNumberTransaction;
    @Column(name = "created_date", nullable = true)
    private LocalDateTime createdDate;
    @Column(name = "value", nullable = true)
    private double value;

    @Column(name = "state", nullable = true)
    @Enumerated(EnumType.STRING)
    private PaymentStateType state;

    @Column(name = "paid_date", nullable = true)
    private LocalDateTime paidDate;
}
