package us.codezen.owner.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "owner")
@Data
public class Owner {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_owner;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "second_name", length = 30)
    private String secondName;
    @Column(name = "first_last_name", length = 30)
    private String firstLastName;
    @Column(name = "second_last_name", length = 30)
    private String secondLastName;
    @Column(name = "birthday", length = 30)
    private String birthday;
    @Column(name = "phone", length = 50)
    private String phone;
    @Column(name = "email", length = 50)
    private String email;
}