package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICanchaDao;
import pe.edu.upc.entity.Cancha;

public class CanchaDaoImpl implements ICanchaDao, Serializable{
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insertar(Cancha cancha) {
		em.persist(cancha);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cancha> listar() {
		List<Cancha> lista = new ArrayList<Cancha>();
		Query q = em.createQuery("select c from Cancha c");
		lista = (List<Cancha>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int canchaID) {
		Cancha cancha = new Cancha();
		cancha = em.getReference(Cancha.class, canchaID);
		em.remove(cancha);
	}
}
