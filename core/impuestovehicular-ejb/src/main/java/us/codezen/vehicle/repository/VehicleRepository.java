package us.codezen.vehicle.repository;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import us.codezen.vehicle.entities.Vehicle;

@Stateless
public class VehicleRepository {
  @PersistenceContext
  private EntityManager em;

  public Vehicle create(Vehicle vehicle) {
    em.persist(vehicle);
    return vehicle;
  }
}
