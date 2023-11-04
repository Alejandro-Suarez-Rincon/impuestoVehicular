package us.codezen.rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import us.codezen.repository.VersionRepository;

@Path("/rest/version")
public class Version {

  @Inject
  private VersionRepository versionRepository;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response getVersion() {
    return Response.ok("{\"version\":\"" + versionRepository.getVersion() +"\"}").build();
  }
}
