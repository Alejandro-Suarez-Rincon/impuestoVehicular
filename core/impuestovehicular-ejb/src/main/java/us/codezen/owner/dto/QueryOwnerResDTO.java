package us.codezen.owner.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@Getter
@Setter
public class QueryOwnerResDTO{
    private int identification;
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String SecondLastName;
    private Date birthday;
    private int phone;
    private String email;
    private String typeIdentification;
}