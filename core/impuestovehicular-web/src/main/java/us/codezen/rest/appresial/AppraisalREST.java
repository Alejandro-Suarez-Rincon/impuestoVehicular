package us.codezen.rest.appresial;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import us.codezen.appraisal.dto.*;
import us.codezen.appraisal.entities.Appraisal;
import us.codezen.appraisal.service.AppraisalService;

@Path("/appraisals")
public class AppraisalREST {

  @Inject
  private AppraisalService appraisalService;

  @POST
  public Response createAppraisal(CreateAppraisalReqDTO createAppraisalReqDTO) {
    CreateAppraisalResDTO createdAppraisal = appraisalService.createAppraisal(createAppraisalReqDTO);
    return Response.ok(createdAppraisal).build();
  }
//servicio obtener usuarios id
  @GET
  @Path("/{id}")
  public Response getAppraisalById(@PathParam("id") Long id) {
    QueryAppraisalReqDTO queryAppraisalReqDTO = new QueryAppraisalReqDTO();
    queryAppraisalReqDTO.setId_appraisal(id);
    QueryAppraisalResDTO appraisal = appraisalService.consult(queryAppraisalReqDTO);
    if (appraisal != null) {
      return Response.ok(appraisal).build();
    } else {
      return Response.status(Response.Status.NOT_FOUND).build();
    }
  }
  //SERVICIO REST ACTUALIZAR

  @PUT
  @Path("/{id}")
  public Response updateAppraisal(@PathParam("id") Long id, UpdateAppraisalReqDTO updateAppraisalReqDTO) {
    updateAppraisalReqDTO.setId_appraisal(id);
    Appraisal updatedAppraisal = appraisalService.updateAppraisal(updateAppraisalReqDTO);
    if (updatedAppraisal != null) {
      return Response.ok(updatedAppraisal).build();
    } else {
      return Response.status(Response.Status.NOT_FOUND).build();
    }
  }
}
