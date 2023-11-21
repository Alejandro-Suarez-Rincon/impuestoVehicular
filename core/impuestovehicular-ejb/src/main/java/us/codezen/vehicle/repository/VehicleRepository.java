package us.codezen.vehicle.repository;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import us.codezen.vehicle.dto.UpdateVehicleReqDTO;
import us.codezen.vehicle.entities.VehicleCharacteristics;

@Stateless
public class VehicleRepository {
    @PersistenceContext
    private EntityManager em;
    public VehicleCharacteristics createVehicle(VehicleCharacteristics vehicleCharacteristics){
        em.persist(vehicleCharacteristics);
        return vehicleCharacteristics;
    }

    public  VehicleCharacteristics getVehicleByIdCharacteristcs(Long idCharacteristicsVehicle){
        TypedQuery<VehicleCharacteristics> query=em.createQuery("SELECT v FROM VehicleCharacteristics v " +
                "WHERE v.idCharacteristicsVehicle=: idCharacteristicsVehicle", VehicleCharacteristics.class);
        query.setParameter("idCharacteristicsVehicle", idCharacteristicsVehicle);
        try {
            return query.getSingleResult();
        }catch (Exception e){
            return null;
        }
    }
    public VehicleCharacteristics updateVehicle(VehicleCharacteristics updatedVehicle) {
        return em.merge(updatedVehicle);
    }

    public VehicleCharacteristics findVehicleById(Long id) {
        return em.find(VehicleCharacteristics.class, id);
    }

}
