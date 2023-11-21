package us.codezen.admin.repository;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import us.codezen.admin.entity.Admin;

@Stateless
public class AdminRepository {

    @PersistenceContext
    private EntityManager em;

    public Admin createAdmin(Admin admin) {
        em.persist(admin);
        return admin;
    }

    public Admin getAdminByEmail(String email) {
        TypedQuery<Admin> query = em.createQuery("SELECT a FROM Admin a WHERE a.email = :email", Admin.class);
        query.setParameter("email", email);

        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public Admin getAdminByEmailAndPassword(String email, String password) {
        TypedQuery<Admin> query = em.createQuery("SELECT a FROM Admin a WHERE a.email = :email AND a.password = :password", Admin.class);
        query.setParameter("email", email);
        query.setParameter("password", password);

        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}

