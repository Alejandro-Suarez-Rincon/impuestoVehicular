package us.codezen.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidateAdminReqDTO implements Serializable {
  @NonNull
  private String email;
  
  @NonNull
  private String password;
}
