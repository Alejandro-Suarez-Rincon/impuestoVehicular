package us.codezen.rest.vehicle;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import us.codezen.vehicle.service.VehicleService;
import us.codezen.vehicle.dto.CreateVehicleReqDTO;

@Path("/rest/vehicle")
public class VehicleREST {
    @Inject
    VehicleService vehicleService;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Response test(CreateVehicleReqDTO createVehicleReqDTO){
      System.out.println(createVehicleReqDTO.getPlate());
      //vehicleService.createVehicle(createVehicleReqDTO);
      return Response.ok("Created").build();
    }

}
