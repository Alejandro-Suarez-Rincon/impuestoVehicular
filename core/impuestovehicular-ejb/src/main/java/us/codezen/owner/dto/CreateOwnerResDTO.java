package us.codezen.owner.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class CreateOwnerResDTO {
    @NotNull
    private String message;
}
