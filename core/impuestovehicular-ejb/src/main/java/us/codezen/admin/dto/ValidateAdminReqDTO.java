package us.codezen.admin.dto;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidateAdminReqDTO implements Serializable {
  @Nonnull
  private String email;
  
  @Nonnull
  private String password;
}