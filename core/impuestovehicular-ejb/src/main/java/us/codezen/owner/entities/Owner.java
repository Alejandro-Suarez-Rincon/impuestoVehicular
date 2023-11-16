package us.codezen.owner.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Owner {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_owner;

    @Column(name = "identification", nullable = false)
    private  Long identification;

    @Column(name = "identification_type", nullable = false)
    private boolean identificationType;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name", length = 30)
    private String secondName;

    @Column(name = "first_last_name", length = 30)
    private String firstLastName;

    @Column(name = "second_last_name", length = 30)
    private String secondLastName;

    @Column(name = "born_date", length = 30)
    private String bornDate;

    @Column(name = "phone", length = 50)
    private String phone;

    @Column(name = "email", length = 50)
    private String email;
}