package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cliente;
import pe.edu.upc.service.IClienteService;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class ClienteController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IClienteService clService;
	
	@Inject
	private IUsuarioService uService;
	
	private Cliente cliente;
	List<Cliente> listaClientes;
	
	private Usuario usuario;
	List<Usuario> listaUsuarios;
	
	
	@PostConstruct
	public void init() {
		this.listaClientes = new ArrayList<Cliente>();
		this.cliente = new Cliente();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.usuario = new Usuario();

		this.listarCliente();
		this.listarUsuarios();
	}
	
	public String nuevoCliente() {
		this.setCliente(new Cliente());
		return "cliente.xhtml";
	}
	
	public void insertar() {
		clService.insertar(cliente);
		limpiarCliente();
	}
	
	public void listarCliente() {
		listaClientes = clService.listar();
	}
	
	public void listarUsuarios() {
		listaUsuarios = uService.listar();
	}
	
	public void limpiarCliente() {
		this.init();
	}
	
	public void eliminar(Cliente cliente) {
		clService.eliminar(cliente.getClienteID());
		this.listarCliente();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
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

		
}
