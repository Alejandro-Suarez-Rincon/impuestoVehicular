package us.codezen.owner.repository;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import us.codezen.owner.entities.Owner;
import us.codezen.owner.enums.OwnerIdentificationTypeEnum;

import java.time.LocalDateTime;
import java.util.List;

@Stateless
public class OwnerRepository {
    public List<Owner> SearchOwner;
    @PersistenceContext
    private EntityManager em;

    public Owner createOwner(Owner owner) {
        em.persist(owner);
        return owner;
    }

    public Owner getOwner(Long identification, OwnerIdentificationTypeEnum identificationType, String firstname, String secondName, String firstLastName, String secondLastName, LocalDateTime bornDate, Long phone, String email) {
        TypedQuery<Owner> query = em.createQuery("SELECT o FROM Owner o WHERE o.identification= :identification", Owner.class);
        query.setParameter("identification",identification);
        query.setParameter("identificationType",identificationType);
        query.setParameter("firstname",firstname);
        query.setParameter("firstLastName",firstLastName);
        query.setParameter("secondLastName",secondLastName);
        query.setParameter("bornDate",bornDate);
        query.setParameter("secondName",secondName);
        query.setParameter("phone",phone);
        query.setParameter("email",email);

        try{
            return query.getSingleResult();
        }catch (Exception e) {
            return null;
        }
    }

    public Owner getOwner(Long identification) {
        TypedQuery<Owner> query = em.createQuery("SELECT o FROM Owner o WHERE o.identification = :identification ", Owner.class);
        query.setParameter("identification", identification);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public void updateOwner(Owner existingOwner) {

    }
}
