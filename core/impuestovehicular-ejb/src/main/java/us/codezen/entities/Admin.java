package us.codezen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Admin {
  @Id
  @GeneratedValue
  private Long id;

  @Column
  private String email;

  @Column
  private String password;
}
