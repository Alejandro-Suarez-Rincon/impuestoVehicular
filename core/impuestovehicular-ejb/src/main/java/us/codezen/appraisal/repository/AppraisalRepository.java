package us.codezen.appraisal.repository;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import us.codezen.admin.entity.Admin;
import us.codezen.appraisal.entities.Appraisal;

@Stateless

public class AppraisalRepository {
    @PersistenceContext
    private EntityManager em;

    public Appraisal createAppraisal(Appraisal appraisal) {
        em.persist(appraisal);
        return appraisal;
    }

    public Appraisal findByIdAppraisal(Long idAppraisal) {
        try {
            return em.createQuery(
                            "SELECT a FROM Appraisal a WHERE a.id_appraisal = :idAppraisal", Appraisal.class)
                    .setParameter("id", idAppraisal)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    public Appraisal updateAppraisal(Appraisal appraisal) {
        return em.merge(appraisal);
    }
}
