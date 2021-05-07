package br.upe.syscond.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.upe.syscond.models.Espaco;


public class LocacaoDAO implements InterfaceLocacao {

	private static LocacaoDAO instance;
	protected EntityManager em;
	
	/**
     * 
     * @return instance
     */

	public static LocacaoDAO getInstance() {
		if (instance == null) {
			instance = new LocacaoDAO();
		}
		return instance;
	}

	private LocacaoDAO() {
		em = getEntityManager();
	}
    /**
     * 
     * @return EntityManager
     */
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		if (em == null) {
			em = factory.createEntityManager();
		}
		return em;
	}
    /**
     * @param integer
	 * @return Locaçao
	 */
	public Espaco buscar(int id) throws Exception {
		Espaco l = null;
		try {
			em.getTransaction().begin();
			l = em.find(Espaco.class, id);
			em.getTransaction().commit();
			return l;
		} catch (Exception eBuscar) {
			em.getTransaction().rollback();
			throw eBuscar;
		}
	}
	/**
	 * param Espaco
	 * @return Espaco
	 */
	public Espaco salvar(Espaco l) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(l);
			em.getTransaction().commit();
			return buscar(l.getId());
		} catch (Exception eSalvar) {
			em.getTransaction().rollback();
			throw eSalvar;
		}
	}
	/**
	 * param Espaco
	 * @return Espaco
	 */
	public Espaco atualizar(Espaco l) throws Exception {
		try {
			em.getTransaction().begin();
			em.merge(l);
			em.getTransaction().commit();
			return buscar(l.getId());
		} catch (Exception eAtualizar) {
			em.getTransaction().rollback();
			throw eAtualizar;
		}
	}
    /**
     * @param integer
	 * @return boolean
	 */
	public void deletar(int id) throws Exception {
		Espaco l = null;
		try {
			em.getTransaction().begin();
			l = em.find(Espaco.class, id);
			em.remove(l);
			em.getTransaction().commit();
		} catch (Exception eDeletar) {
			em.getTransaction().rollback();
			throw eDeletar;
		}
	}
    /**
	 * @return Lista de Espaço[]
	 */
	@SuppressWarnings("unchecked")
	public List<Espaco> listar() {
		try {
			return (em.createQuery("from " + Espaco.class.getName()).getResultList());
		} catch (Exception eListar) {
			throw eListar;
		}

	}

}
