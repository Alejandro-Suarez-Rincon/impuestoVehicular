package us.codezen.admin.dto;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
public class CreateAdminReqDTO implements Serializable {
    @NonNull
    private String email;

    @NonNull
    private String password;
}