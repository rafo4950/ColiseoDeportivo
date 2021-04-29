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
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.entity.CentroDeportivo;
import pe.edu.upc.service.ICentroDeportivoService;

@Named
@RequestScoped
public class AdminController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IAdminService aService;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private ICentroDeportivoService cdService;
	
	private Admin admin;
	List<Admin> listaAdmins;
	
	private Usuario usuario;
	List<Usuario> listaUsuarios;
	
	private CentroDeportivo centrodeportivo;
	List<CentroDeportivo> listaCentroDeportivos;
	
	@PostConstruct
	public void init() {
		this.listaAdmins = new ArrayList<Admin>();
		this.admin = new Admin();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.usuario = new Usuario();
		this.listaCentroDeportivos = new ArrayList<CentroDeportivo>();
		this.centrodeportivo = new CentroDeportivo();
		
		this.listarAdmin();
		this.listarUsuarios();
		this.listarCentroDeportivos();
	}
	
	public String nuevoAdmin() {
		this.setAdmin(new Admin());
		return "admin.xhtml";
	}
	
	public void insertar() {
		aService.insertar(admin);
		limpiarAdmin();
	}
	
	public void listarAdmin() {
		listaAdmins = aService.listar();
	}
	
	public void listarUsuarios() {
		listaUsuarios = uService.listar();
	}
	
	public void listarCentroDeportivos() {
		listaCentroDeportivos = cdService.listar();
	}
	
	public void limpiarAdmin() {
		this.init();
	}
	
	public void eliminar(Admin admin) {
		aService.eliminar(admin.getAdminID());
		this.listarAdmin();
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public CentroDeportivo getCentrodeportivo() {
		return centrodeportivo;
	}

	public void setCentrodeportivo(CentroDeportivo centrodeportivo) {
		this.centrodeportivo = centrodeportivo;
	}

	public List<CentroDeportivo> getListaCentroDeportivos() {
		return listaCentroDeportivos;
	}

	public void setListaCentroDeportivos(List<CentroDeportivo> listaCentroDeportivos) {
		this.listaCentroDeportivos = listaCentroDeportivos;
	}

	
		
}
