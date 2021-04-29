package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICentroDeportivoDao;
import pe.edu.upc.entity.CentroDeportivo;

public class CentroDeportivoDaoImpl implements ICentroDeportivoDao, Serializable{
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insertar(CentroDeportivo centrodeportivo) {
		em.persist(centrodeportivo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CentroDeportivo> listar() {
		List<CentroDeportivo> lista = new ArrayList<CentroDeportivo>();
		Query q = em.createQuery("select cd from CentroDeportivo cd");
		lista = (List<CentroDeportivo>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int centrodeportivoID) {
		CentroDeportivo centrodeportivo = new CentroDeportivo();
		centrodeportivo = em.getReference(CentroDeportivo.class, centrodeportivoID);
		em.remove(centrodeportivo);
	}
}
