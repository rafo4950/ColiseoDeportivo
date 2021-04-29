package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHorarioDao;
import pe.edu.upc.entity.Horario;

public class HorarioDaoImpl implements IHorarioDao, Serializable{
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insertar(Horario horario) {
		em.persist(horario);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Horario> listar() {
		List<Horario> lista = new ArrayList<Horario>();
		Query q = em.createQuery("select h from Horario h");
		lista = (List<Horario>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int horarioID) {
		Horario horario = new Horario();
		horario = em.getReference(Horario.class, horarioID);
		em.remove(horario);
	}
}
