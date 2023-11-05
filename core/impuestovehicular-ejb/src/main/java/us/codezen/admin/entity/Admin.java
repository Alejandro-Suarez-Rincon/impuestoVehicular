package us.codezen.admin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Admin {
  @Id
  @GeneratedValue
  private Long id;

  @Column
  private String email;

  @Column
  private String password;

  public Admin(String email, String password){
    this.email = email;
    this.password = password;
  }
}
