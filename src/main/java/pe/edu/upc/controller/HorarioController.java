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
	
	List<String> opcionesInicio;
	List<String> opcionesFin;
	
	@PostConstruct
	public void init() {
		this.listaHorarios = new ArrayList<Horario>();
		this.horario = new Horario();
		this.listar();

		opcionesInicio = new ArrayList<>();
		opcionesFin = new ArrayList<>();
		for (int i = 6; i < 13; i++) {
			String hour = i + " AM";
			opcionesInicio.add(hour);
			opcionesFin.add(hour);
		}
		
		for (int i = 1; i < 13; i++) {
			String hour = i + " PM";
			opcionesInicio.add(hour);
			opcionesFin.add(hour);
		}
		
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
	
	public List<String> getOpcionesInicio() {
		return opcionesInicio;
	}

	public void setOpcionesInicio(List<String> opcionesInicio) {
		this.opcionesInicio = opcionesInicio;
	}
	
	public List<String> getOpcionesFin() {
		return opcionesFin;
	}

	public void setOpcionesFin(List<String> opcionesFin) {
		this.opcionesFin = opcionesFin;
	}
	
	

	
}
