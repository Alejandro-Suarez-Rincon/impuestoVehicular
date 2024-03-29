package us.codezen;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import us.codezen.repository.VersionRepository;

@Path("/")
public class HomePage {

  @Inject()
  private VersionRepository versionRepository;

  @GET
  @Produces(MediaType.TEXT_HTML)
  public Response getHTMLContent(){
    return Response.ok("<h1>Codezen company</h1> Impuesto Vehicular version: <strong>" + versionRepository.getVersion() + "</strong>").build();
  }
}
