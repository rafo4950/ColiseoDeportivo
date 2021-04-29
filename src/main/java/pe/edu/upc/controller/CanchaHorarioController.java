package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CanchaHorario;
import pe.edu.upc.service.ICanchaHorarioService;
import pe.edu.upc.entity.Cancha;
import pe.edu.upc.service.ICanchaService;
import pe.edu.upc.entity.Horario;
import pe.edu.upc.service.IHorarioService;

@Named
@RequestScoped
public class CanchaHorarioController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICanchaHorarioService cahService;
	
	@Inject
	private ICanchaService cService;
	
	@Inject
	private IHorarioService hService;
	
	private CanchaHorario canchahorario;
	List<CanchaHorario> listaCanchaHorarios;
	
	private Cancha cancha;
	List<Cancha> listaCanchas;
	
	private Horario horario;
	List<Horario> listaHorarios;
	
	@PostConstruct
	public void init() {
		this.listaCanchaHorarios = new ArrayList<CanchaHorario>();
		this.canchahorario = new CanchaHorario();
		this.listaCanchas = new ArrayList<Cancha>();
		this.cancha = new Cancha();
		this.listaHorarios = new ArrayList<Horario>();
		this.horario = new Horario();

		this.listarCanchaHorario();
		this.listarCanchas();
		this.listarHorarios();
	}
	
	public String nuevoCanchaDeporte() {
		this.setCanchahorario(new CanchaHorario());
		return "canchahorario.xhtml";
	}
	
	public void insertar() {
		cahService.insertar(canchahorario);
		limpiarCanchaHorario();
	}
	
	public void listarCanchaHorario() {
		listaCanchaHorarios = cahService.listar();
	}
	
	public void listarCanchas() {
		listaCanchas = cService.listar();
	}
	
	public void listarHorarios() {
		listaHorarios = hService.listar();
	}
	
	public void limpiarCanchaHorario() {
		this.init();
	}
	
	public void eliminar(CanchaHorario canchahorario) {
		cahService.eliminar(canchahorario.getCanchahorarioID());
		this.listarCanchaHorario();
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

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public List<Horario> getListaHorarios() {
		return listaHorarios;
	}

	public void setListaHorarios(List<Horario> listaHorarios) {
		this.listaHorarios = listaHorarios;
	}

		
}
