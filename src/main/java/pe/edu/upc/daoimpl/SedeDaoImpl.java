package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISedeDao;
import pe.edu.upc.entity.Sede;

public class SedeDaoImpl implements ISedeDao, Serializable{
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insertar(Sede sede) {
		em.persist(sede);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sede> listar() {
		List<Sede> lista = new ArrayList<Sede>();
		Query q = em.createQuery("select s from Sede s");
		lista = (List<Sede>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int sedeID) {
		Sede sede = new Sede();
		sede = em.getReference(Sede.class, sedeID);
		em.remove(sede);
	}
}
