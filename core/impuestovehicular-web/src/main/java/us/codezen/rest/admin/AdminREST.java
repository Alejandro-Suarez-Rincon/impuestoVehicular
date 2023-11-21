package us.codezen.rest.admin;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import us.codezen.admin.dto.CreateAdminReqDTO;
import us.codezen.admin.dto.CreateAdminResDTO;
import us.codezen.admin.service.AdminService;

@Path("/rest/admin")
public class AdminREST{
  @Inject
  private AdminService adminService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public Response createAdmin(CreateAdminReqDTO createAdminReqDTO){
    final CreateAdminResDTO createAdminResDTO = this.adminService.createAdmin(createAdminReqDTO);
    return Response.ok(createAdminResDTO).build();
  }
}
