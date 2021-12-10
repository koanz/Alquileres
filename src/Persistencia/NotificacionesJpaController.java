/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Notificaciones;
import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Lucho
 */
public class NotificacionesJpaController implements Serializable {

    public NotificacionesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public NotificacionesJpaController() {
        this.emf = Persistence.createEntityManagerFactory("AlquileresPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Notificaciones notificaciones) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(notificaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Notificaciones notificaciones) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            notificaciones = em.merge(notificaciones);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = notificaciones.getId();
                if (findNotificaciones(id) == null) {
                    throw new NonexistentEntityException("The notificaciones with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Notificaciones notificaciones;
            try {
                notificaciones = em.getReference(Notificaciones.class, id);
                notificaciones.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The notificaciones with id " + id + " no longer exists.", enfe);
            }
            em.remove(notificaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Notificaciones> findNotificacionesEntities() {
        return findNotificacionesEntities(true, -1, -1);
    }

    public List<Notificaciones> findNotificacionesEntities(int maxResults, int firstResult) {
        return findNotificacionesEntities(false, maxResults, firstResult);
    }

    private List<Notificaciones> findNotificacionesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Notificaciones.class));
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

    public Notificaciones findNotificaciones(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Notificaciones.class, id);
        } finally {
            em.close();
        }
    }

    public int getNotificacionesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Notificaciones> rt = cq.from(Notificaciones.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
