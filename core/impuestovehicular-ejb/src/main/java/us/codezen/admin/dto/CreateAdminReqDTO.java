package us.codezen.admin.dto;



@Data
public class CreateAdminReqDTO implements Serializable {
  @Nonnull
  private String email;
  @Nonnull
  private String password;
}
