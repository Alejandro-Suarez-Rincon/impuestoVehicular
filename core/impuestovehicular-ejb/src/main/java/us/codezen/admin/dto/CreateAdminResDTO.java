package us.codezen.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;


import javax.annotation.Nonnull;

import java.io.Serializable;

@Data
public class CreateAdminResDTO {
    @Nonnull
    private Long id;

    @Nonnull
    private String email;
 
}

