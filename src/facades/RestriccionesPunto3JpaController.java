/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.RestriccionesPunto3;
import facades.exceptions.NonexistentEntityException;
import facades.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author USER
 */
public class RestriccionesPunto3JpaController implements Serializable {

    public RestriccionesPunto3JpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(RestriccionesPunto3 restriccionesPunto3) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(restriccionesPunto3);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findRestriccionesPunto3(restriccionesPunto3.getOwner()) != null) {
                throw new PreexistingEntityException("RestriccionesPunto3 " + restriccionesPunto3 + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(RestriccionesPunto3 restriccionesPunto3) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            restriccionesPunto3 = em.merge(restriccionesPunto3);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = restriccionesPunto3.getOwner();
                if (findRestriccionesPunto3(id) == null) {
                    throw new NonexistentEntityException("The restriccionesPunto3 with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            RestriccionesPunto3 restriccionesPunto3;
            try {
                restriccionesPunto3 = em.getReference(RestriccionesPunto3.class, id);
                restriccionesPunto3.getOwner();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The restriccionesPunto3 with id " + id + " no longer exists.", enfe);
            }
            em.remove(restriccionesPunto3);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<RestriccionesPunto3> findRestriccionesPunto3Entities() {
        return findRestriccionesPunto3Entities(true, -1, -1);
    }

    public List<RestriccionesPunto3> findRestriccionesPunto3Entities(int maxResults, int firstResult) {
        return findRestriccionesPunto3Entities(false, maxResults, firstResult);
    }

    private List<RestriccionesPunto3> findRestriccionesPunto3Entities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(RestriccionesPunto3.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public RestriccionesPunto3 findRestriccionesPunto3(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(RestriccionesPunto3.class, id);
        } finally {
            em.close();
        }
    }

    public int getRestriccionesPunto3Count() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<RestriccionesPunto3> rt = cq.from(RestriccionesPunto3.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
