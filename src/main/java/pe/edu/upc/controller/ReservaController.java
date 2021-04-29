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
import pe.edu.upc.entity.Cliente;
import pe.edu.upc.service.IClienteService;
import pe.edu.upc.entity.CanchaHorario;
import pe.edu.upc.service.ICanchaHorarioService;
import pe.edu.upc.entity.Estado;
import pe.edu.upc.service.IEstadoService;

@Named
@RequestScoped
public class ReservaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IReservaService rService;
	
	@Inject
	private IClienteService clService;
	
	@Inject
	private ICanchaHorarioService cahService;
	
	@Inject
	private IEstadoService eService;
	
	private Reserva reserva;
	List<Reserva> listaReservas;
	
	private Cliente cliente;
	List<Cliente> listaClientes;
	
	private CanchaHorario canchahorario;
	List<CanchaHorario> listaCanchaHorarios;
	
	private Estado estado;
	List<Estado> listaEstados;
	
	@PostConstruct
	public void init() {
		this.listaReservas = new ArrayList<Reserva>();
		this.reserva = new Reserva();
		
		this.listaClientes = new ArrayList<Cliente>();
		this.cliente = new Cliente();
		
		this.listaCanchaHorarios = new ArrayList<CanchaHorario>();
		this.canchahorario = new CanchaHorario();
		
		this.listaEstados = new ArrayList<Estado>();
		this.estado = new Estado();
		
		this.listarReserva();
		this.listarClientes();
		this.listarCanchaHorarios();
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
	
	public void listarClientes() {
		listaClientes = clService.listar();
	}
	
	public void listarCanchaHorarios() {
		listaCanchaHorarios = cahService.listar();
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

	public CanchaHorario getCanchahorario() {
		return canchahorario;
	}

	public void setCanchahorario(CanchaHorario canchahorario) {
		this.canchahorario = canchahorario;
	}

	public List<CanchaHorario> getListaCanchaHorarios() {
		return listaCanchaHorarios;
	}

	public void setListaCanchaHorarios(List<CanchaHorario> listaCanchaHorarios) {
		this.listaCanchaHorarios = listaCanchaHorarios;
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
