package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICanchaHorarioDao;
import pe.edu.upc.entity.CanchaHorario;

public class CanchaHorarioDaoImpl implements ICanchaHorarioDao, Serializable{
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insertar(CanchaHorario canchahorario) {
		em.persist(canchahorario);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CanchaHorario> listar() {
		List<CanchaHorario> lista = new ArrayList<CanchaHorario>();
		Query q = em.createQuery("select cah from CanchaHorario cah");
		lista = (List<CanchaHorario>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int canchahorarioID) {
		CanchaHorario canchahorario = new CanchaHorario();
		canchahorario = em.getReference(CanchaHorario.class, canchahorarioID);
		em.remove(canchahorario);
	}
}
