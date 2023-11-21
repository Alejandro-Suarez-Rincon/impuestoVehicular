package us.codezen.owner.Controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import us.codezen.owner.dto.CreateOwnerReqDTO;
import us.codezen.owner.dto.QueryOwnerReqDTO;
import us.codezen.owner.dto.SearchOwnerReqDTO;
import us.codezen.owner.dto.UpdateOwnerReqDTO;
import us.codezen.owner.service.OwnerService;

@AllArgsConstructor
@NoArgsConstructor
@Path("/owners")
public class OwnerController {

    @Inject
    OwnerService service;

    @POST
    public Response createOwner(CreateOwnerReqDTO req) {
        return Response.ok(service.createOwner(req)).build();
    }

    @GET
    @Path("/{id}")
    public Response queryOwner(@PathParam("id") String id) {
        QueryOwnerReqDTO req = new QueryOwnerReqDTO();
        req.setIdentification(req.getIdentification());
        return Response.ok(service.queryOwner(req)).build();
    }

    @GET
    @Path("/search")
    public Response searchOwner(SearchOwnerReqDTO req) {
        return Response.ok(service.searchOwner(req)).build();
    }

    @PUT
    public Response updateOwner(UpdateOwnerReqDTO req) {
        service.updateOwner(req);
        return Response.noContent().build();
    }

}
