package us.codezen.vehicle.repository;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import us.codezen.vehicle.entities.VehicleCharacteristics;

@Stateless
public class VehicleRepository {
    @PersistenceContext
    private EntityManager em;
    public VehicleCharacteristics CreateVehicle(VehicleCharacteristics vehicleCharacteristics){
        em.persist(vehicleCharacteristics);
        return vehicleCharacteristics;
    }

 //   public VehicleCharacteristics getVehicleByIdCharacteristcs(Long idCharacteristics){
     //   em.
   // }

}
