package us.codezen.owner.entities;

import jakarta.persistence.*;
import lombok.Data;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;

@Entity
@Data
public class Owner {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_owner;

    @Column(name = "identification", nullable = false)
    private  Long identification;

    @Column(name = "identification_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private OwnerIdentificationTypeEnum identificationType;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "second_name", length = 30, nullable = false)
    private String secondName;

    @Column(name = "first_last_name", length = 30, nullable = false)
    private String firstLastName;

    @Column(name = "second_last_name", length = 30, nullable = false)
    private String secondLastName;

    @Column(name = "born_date", length = 30, nullable = false)
    private String bornDate;

    @Column(name = "phone", length = 50, nullable = false)
    private String phone;

    @Column(name = "email", length = 50, nullable = false)
    private String email;
    
}
