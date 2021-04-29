package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICanchaDeporteDao;
import pe.edu.upc.entity.CanchaDeporte;

public class CanchaDeporteDaoImpl implements ICanchaDeporteDao, Serializable{
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insertar(CanchaDeporte canchadeporte) {
		em.persist(canchadeporte);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CanchaDeporte> listar() {
		List<CanchaDeporte> lista = new ArrayList<CanchaDeporte>();
		Query q = em.createQuery("select cad from CanchaDeporte cad");
		lista = (List<CanchaDeporte>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int canchadeporteID) {
		CanchaDeporte canchadeporte = new CanchaDeporte();
		canchadeporte = em.getReference(CanchaDeporte.class, canchadeporteID);
		em.remove(canchadeporte);
	}
}
