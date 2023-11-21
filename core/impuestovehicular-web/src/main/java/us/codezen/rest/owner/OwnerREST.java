package us.codezen.rest.owner;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import us.codezen.owner.dto.CreateOwnerReqDTO;
import us.codezen.owner.dto.CreateOwnerResDTO;
import us.codezen.owner.service.OwnerService;

@Path("/rest/owner")
public class OwnerREST {
  @Inject
  OwnerService ownerService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public Response create(CreateOwnerReqDTO createOwnerReqDTO) {
    System.out.println(createOwnerReqDTO);
    CreateOwnerResDTO createOwnerResDTO = ownerService.create(createOwnerReqDTO);
    return Response.ok(createOwnerResDTO).build();
  }
}
