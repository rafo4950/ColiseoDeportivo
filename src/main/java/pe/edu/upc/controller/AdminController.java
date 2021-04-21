package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Admin;
import pe.edu.upc.service.IAdminService;

@Named
@RequestScoped
public class AdminController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAdminService aService;
	private Admin admin;
	List<Admin> listaAdmins;
	
	@PostConstruct
	public void init() {
		this.listaAdmins = new ArrayList<Admin>();
		this.admin = new Admin();
		this.listar();
	}
	
	public String nuevoAdmin() {
		this.setAdmin(new Admin());
		return "admin.xhtml";
	}
	
	public void insertar() {
		aService.insertar(admin);
		limpiarAdmin();
	}
	
	public void listar() {
		listaAdmins = aService.listar();
	}
	
	public void limpiarAdmin() {
		this.init();
	}
	
	public void eliminar(Admin admin) {
		aService.eliminar(admin.getAdminID());
		this.listar();
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public List<Admin> getListaAdmins() {
		return listaAdmins;
	}

	public void setListaAdmins(List<Admin> listaAdmins) {
		this.listaAdmins = listaAdmins;
	}
	
	
}
