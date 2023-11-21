package us.codezen.owner.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;
import us.codezen.vehicle.entities.Vehicle;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Owner {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String identification;

    @NonNull
    @Column(name = "identification_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private OwnerIdentificationTypeEnum identificationType;

    @NonNull
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NonNull
    @Column(name = "second_name", length = 30, nullable = false)
    private String secondName;

    @NonNull
    @Column(name = "first_last_name", length = 30, nullable = false)
    private String firstLastName;

    @NonNull
    @Column(name = "second_last_name", length = 30, nullable = false)
    private String secondLastName;

    @NonNull
    @Column(name = "born_date", length = 30, nullable = false)
    private LocalDateTime bornDate;

    @NonNull
    @Column(name = "phone", length = 50, nullable = false)
    private String phone;

    @NonNull
    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @OneToMany(mappedBy = "owner")
    private List<Vehicle> vehicles;

}
