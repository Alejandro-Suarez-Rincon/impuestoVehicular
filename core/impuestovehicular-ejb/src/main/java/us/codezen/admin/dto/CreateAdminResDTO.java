package us.codezen.admin.dto;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CreateAdminResDTO {
  @Nonnull
  private long id;

  @Nonnull
  private String email;
}
