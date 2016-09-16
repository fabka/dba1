/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.ColumnasDba;
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
public class ColumnasDbaJpaController implements Serializable {

    public ColumnasDbaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ColumnasDba columnasDba) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(columnasDba);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findColumnasDba(columnasDba.getOwner()) != null) {
                throw new PreexistingEntityException("ColumnasDba " + columnasDba + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ColumnasDba columnasDba) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            columnasDba = em.merge(columnasDba);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = columnasDba.getOwner();
                if (findColumnasDba(id) == null) {
                    throw new NonexistentEntityException("The columnasDba with id " + id + " no longer exists.");
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
            ColumnasDba columnasDba;
            try {
                columnasDba = em.getReference(ColumnasDba.class, id);
                columnasDba.getOwner();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The columnasDba with id " + id + " no longer exists.", enfe);
            }
            em.remove(columnasDba);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ColumnasDba> findColumnasDbaEntities() {
        return findColumnasDbaEntities(true, -1, -1);
    }

    public List<ColumnasDba> findColumnasDbaEntities(int maxResults, int firstResult) {
        return findColumnasDbaEntities(false, maxResults, firstResult);
    }

    private List<ColumnasDba> findColumnasDbaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ColumnasDba.class));
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

    public ColumnasDba findColumnasDba(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ColumnasDba.class, id);
        } finally {
            em.close();
        }
    }

    public int getColumnasDbaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ColumnasDba> rt = cq.from(ColumnasDba.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
