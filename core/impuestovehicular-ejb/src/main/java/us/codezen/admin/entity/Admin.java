package us.codezen.admin.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
//@Table(name = "Admin")
public class Admin {
  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "email", length = 100, nullable = false)
  private String email;

  @Column(name = "password", length = 50, nullable = false)
  private String password;

  public Admin(String email, String password){
    this.email = email;
    this.password = password;
  }

  public Admin() {
  }
}
