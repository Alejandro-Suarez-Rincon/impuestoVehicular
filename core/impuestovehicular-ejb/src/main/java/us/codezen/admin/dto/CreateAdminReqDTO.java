package us.codezen.admin.dto;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAdminReqDTO implements Serializable {
  @Nonnull
  private String email;
  @Nonnull
  private String password;
}
