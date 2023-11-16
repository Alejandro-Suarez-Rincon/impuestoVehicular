package us.codezen.admin.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import us.codezen.admin.dto.CreateAdminReqDTO;
import us.codezen.admin.dto.CreateAdminResDTO;
import us.codezen.admin.entity.Admin;

@Stateless
public class AdminService {
  @PersistenceContext
  private EntityManager em;

  public CreateAdminResDTO createAdmin(CreateAdminReqDTO createAdminReqDTO) {
    final Admin admin = new Admin(
        createAdminReqDTO.getEmail(),
        createAdminReqDTO.getPassword());
    em.persist(admin);

    return new CreateAdminResDTO(admin.getId(), admin.getEmail());
  }
}
