package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Reserva;
import pe.edu.upc.service.IReservaService;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.entity.Cancha;
import pe.edu.upc.service.ICanchaService;
import pe.edu.upc.entity.Estado;
import pe.edu.upc.service.IEstadoService;

@Named
@RequestScoped
public class ReservaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IReservaService rService;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private ICanchaService cService;
	
	@Inject
	private IEstadoService eService;
	
	private Reserva reserva;
	List<Reserva> listaReservas;
	
	private Usuario usuario;
	List<Usuario> listaUsuarios;
	
	private Cancha cancha;
	List<Cancha> listaCanchas;
	
	private Estado estado;
	List<Estado> listaEstados;
	
	@PostConstruct
	public void init() {
		this.listaReservas = new ArrayList<Reserva>();
		this.reserva = new Reserva();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.usuario = new Usuario();
		this.listaCanchas = new ArrayList<Cancha>();
		this.cancha = new Cancha();
		this.listaEstados = new ArrayList<Estado>();
		this.estado = new Estado();
		this.listarReserva();
		this.listarUsuarios();
		this.listarCanchas();
		this.listarEstados();
	}
	
	public String nuevoReserva() {
		this.setReserva(new Reserva());
		return "reserva.xhtml";
	}
	
	public void insertar() {
		rService.insertar(reserva);
		limpiarReserva();
	}
	
	public void listarReserva() {
		listaReservas = rService.listar();
	}
	
	public void listarUsuarios() {
		listaUsuarios = uService.listar();
	}
	
	public void listarCanchas() {
		listaCanchas = cService.listar();
	}
	
	public void listarEstados() {
		listaEstados = eService.listar();
	}
	
	public void limpiarReserva() {
		this.init();
	}
	
	public void eliminar(Reserva reserva) {
		rService.eliminar(reserva.getReservaID());
		this.listarReserva();
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public List<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
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

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public List<Cancha> getListaCanchas() {
		return listaCanchas;
	}

	public void setListaCanchas(List<Cancha> listaCanchas) {
		this.listaCanchas = listaCanchas;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Estado> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<Estado> listaEstados) {
		this.listaEstados = listaEstados;
	}
	
		
}
