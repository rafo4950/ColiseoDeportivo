package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDeporteDao;
import pe.edu.upc.entity.Deporte;

public class DeporteDaoImpl implements IDeporteDao, Serializable{
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insertar(Deporte deporte) {
		em.persist(deporte);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Deporte> listar() {
		List<Deporte> lista = new ArrayList<Deporte>();
		Query q = em.createQuery("select d from Deporte d");
		lista = (List<Deporte>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int sportID) {
		Deporte deporte = new Deporte();
		deporte = em.getReference(Deporte.class, sportID);
		em.remove(deporte);
	}
}
