package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cancha;
import pe.edu.upc.service.ICanchaService;
import pe.edu.upc.entity.Deporte;
import pe.edu.upc.service.IDeporteService;
import pe.edu.upc.entity.Sede;
import pe.edu.upc.service.ISedeService;
import pe.edu.upc.entity.Horario;
import pe.edu.upc.service.IHorarioService;

@Named
@RequestScoped
public class CanchaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICanchaService cService;
	
	@Inject
	private IDeporteService dService;
	
	@Inject
	private ISedeService sService;
	
	@Inject
	private IHorarioService hService;
	
	private Cancha cancha;
	List<Cancha> listaCanchas;
	
	private Deporte deporte;
	List<Deporte> listaDeportes;
	
	private Sede sede;
	List<Sede> listaSedes;
	
	private Horario horario;
	List<Horario> listaHorarios;
	
	@PostConstruct
	public void init() {
		this.listaCanchas = new ArrayList<Cancha>();
		this.cancha = new Cancha();
		this.listaDeportes = new ArrayList<Deporte>();
		this.deporte = new Deporte();
		this.listaSedes = new ArrayList<Sede>();
		this.sede = new Sede();
		this.listaHorarios = new ArrayList<Horario>();
		this.horario = new Horario();
		this.listarCancha();
		this.listarDeporte();
		this.listarSede();
		this.listarHorario();
	}
	
	public String nuevoCancha() {
		this.setCancha(new Cancha());
		return "cancha.xhtml";
	}
	
	public void insertar() {
		cService.insertar(cancha);
		limpiarCancha();
	}
	
	public void listarCancha() {
		listaCanchas = cService.listar();
	}
	
	public void listarDeporte() {
		listaDeportes = dService.listar();
	}
	
	public void listarSede() {
		listaSedes = sService.listar();
	}
	
	public void listarHorario() {
		listaHorarios = hService.listar();
	}
	
	public void limpiarCancha() {
		this.init();
	}
	
	public void eliminar(Cancha cancha) {
		cService.eliminar(cancha.getCanchaID());
		this.listarCancha();
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

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public List<Deporte> getListaDeportes() {
		return listaDeportes;
	}

	public void setListaDeportes(List<Deporte> listaDeportes) {
		this.listaDeportes = listaDeportes;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public List<Sede> getListaSedes() {
		return listaSedes;
	}

	public void setListaSedes(List<Sede> listaSedes) {
		this.listaSedes = listaSedes;
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
