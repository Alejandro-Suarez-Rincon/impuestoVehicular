package us.codezen.admin.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import us.codezen.admin.dto.*;
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

    public QueryAdminResDTO consultar(QueryAdminReqDTO queryAdminReqDTO) {
        Admin admin = adminRepository.getAdminByEmail(queryAdminReqDTO.getEmail());
        if (admin != null) {
            return new QueryAdminResDTO(admin.getId(), admin.getEmail());
        } else {
            return null; 
        }
    }

    public ValidateAdminResDTO validar(ValidateAdminReqDTO validateAdminReqDTO) {
        Admin admin = adminRepository.getAdminByEmailAndPassword(validateAdminReqDTO.getEmail(), validateAdminReqDTO.getPassword());
        if (admin != null) {
            return new ValidateAdminResDTO(admin.getId(), admin.getEmail());
        } else {
            return null; 
        }
    }

    public QueryAdminResDTO buscar(String email) {
        Admin admin = adminRepository.getAdminByEmail(email);
        if (admin != null) {
            return new QueryAdminResDTO(admin.getId(), admin.getEmail());
        } else {
            return null;
        }
    }
}

