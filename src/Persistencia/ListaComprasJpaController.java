/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.ListaCompras;
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
 * @author Caro
 */
public class ListaComprasJpaController implements Serializable {

    public ListaComprasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

     //metodo constructor
    public ListaComprasJpaController(){
        emf = Persistence.createEntityManagerFactory("ListaComprasPU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ListaCompras listaCompras) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(listaCompras);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ListaCompras listaCompras) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            listaCompras = em.merge(listaCompras);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = listaCompras.getIdLista();
                if (findListaCompras(id) == null) {
                    throw new NonexistentEntityException("The listaCompras with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ListaCompras listaCompras;
            try {
                listaCompras = em.getReference(ListaCompras.class, id);
                listaCompras.getIdLista();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The listaCompras with id " + id + " no longer exists.", enfe);
            }
            em.remove(listaCompras);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ListaCompras> findListaComprasEntities() {
        return findListaComprasEntities(true, -1, -1);
    }

    public List<ListaCompras> findListaComprasEntities(int maxResults, int firstResult) {
        return findListaComprasEntities(false, maxResults, firstResult);
    }

    private List<ListaCompras> findListaComprasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ListaCompras.class));
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

    public ListaCompras findListaCompras(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ListaCompras.class, id);
        } finally {
            em.close();
        }
    }

    public int getListaComprasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ListaCompras> rt = cq.from(ListaCompras.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
