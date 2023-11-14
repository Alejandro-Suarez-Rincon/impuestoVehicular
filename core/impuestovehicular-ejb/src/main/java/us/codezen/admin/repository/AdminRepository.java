package us.codezen.admin.repository;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import us.codezen.admin.entity.Admin;

@Stateless
public class AdminRepository {
  @PersistenceContext
  private EntityManager em;

  public Admin createAdmin(Admin admin){
    em.persist(admin);
    return admin;
  }

}
