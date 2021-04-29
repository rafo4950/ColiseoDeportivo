package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAdminDao;
import pe.edu.upc.entity.Admin;
import pe.edu.upc.service.IAdminService;

@Named
@RequestScoped

public class AdminServiceImpl implements IAdminService, Serializable{

	private static final long serialVersionUID = 1L;

	 @Inject
	 private IAdminDao aD;
	
	@Override
	public void insertar(Admin admin) {
		aD.insertar(admin);
	}

	@Override
	public List<Admin> listar() {
		return aD.listar();
	}

	@Override
	public void eliminar(int adminID) {
		aD.eliminar(adminID);
	}

}
