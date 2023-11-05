package us.codezen.admin.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import us.codezen.admin.dto.CreateAdminReqDTO;
import us.codezen.admin.dto.CreateAdminResDTO;
import us.codezen.admin.entity.Admin;
import us.codezen.admin.repository.AdminRepository;

@Stateless
public class AdminService {
  @Inject
  private AdminRepository adminRepository;

  public CreateAdminResDTO createAdmin(CreateAdminReqDTO createAdminReqDTO) {
    final Admin admin = new Admin(
        createAdminReqDTO.getEmail(),
        createAdminReqDTO.getPassword());
    adminRepository.createAdmin(admin);

    return new CreateAdminResDTO(admin.getId(), admin.getEmail());
  }
}
