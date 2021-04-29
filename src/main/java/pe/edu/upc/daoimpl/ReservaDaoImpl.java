package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IReservaDao;
import pe.edu.upc.entity.Reserva;

public class ReservaDaoImpl implements IReservaDao, Serializable{
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insertar(Reserva reserva) {
		em.persist(reserva);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reserva> listar() {
		List<Reserva> lista = new ArrayList<Reserva>();
		Query q = em.createQuery("select r from Reserva r");
		lista = (List<Reserva>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int reservaID) {
		Reserva reserva = new Reserva();
		reserva = em.getReference(Reserva.class, reservaID);
		em.remove(reserva);
	}
}
