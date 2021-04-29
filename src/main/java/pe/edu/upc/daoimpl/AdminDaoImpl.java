package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAdminDao;
import pe.edu.upc.entity.Admin;

public class AdminDaoImpl implements IAdminDao, Serializable{
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insertar(Admin admin) {
		em.persist(admin);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> listar() {
		List<Admin> lista = new ArrayList<Admin>();
		Query q = em.createQuery("select a from Admin a");
		lista = (List<Admin>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int adminID) {
		Admin admin = new Admin();
		admin = em.getReference(Admin.class, adminID);
		em.remove(admin);
	}
}
