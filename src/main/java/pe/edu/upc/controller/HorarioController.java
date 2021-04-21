package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Horario;
import pe.edu.upc.service.IHorarioService;

@Named
@RequestScoped
public class HorarioController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IHorarioService hService;
	private Horario horario;
	List<Horario> listaHorarios;
	
	@PostConstruct
	public void init() {
		this.listaHorarios = new ArrayList<Horario>();
		this.horario = new Horario();
		this.listar();
	}
	
	public String nuevoHorario() {
		this.setHorario(new Horario());
		return "horario.xhtml";
	}
	
	public void insertar() {
		hService.insertar(horario);
		limpiarHorario();
	}
	
	public void listar() {
		listaHorarios = hService.listar();
	}
	
	public void limpiarHorario() {
		this.init();
	}
	
	public void eliminar(Horario horario) {
		hService.eliminar(horario.getHorarioID());
		this.listar();
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
