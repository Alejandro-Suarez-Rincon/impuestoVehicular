package us.codezen.rest.vehicle;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import us.codezen.vehicle.service.VehicleService;
import us.codezen.vehicle.dto.CreateVehicleReqDTO;
import us.codezen.vehicle.dto.CreateVehicleResDTO;

@Path("/rest/vehicle")
public class VehicleREST {
    @Inject
    VehicleService vehicleService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response test(CreateVehicleReqDTO createVehicleReqDTO){
      System.out.println(createVehicleReqDTO);
      CreateVehicleResDTO vehicle = vehicleService.create(createVehicleReqDTO);
      return Response.ok(vehicle).build();
    }
}
