package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Deporte;
import pe.edu.upc.service.IDeporteService;

@Named
@RequestScoped
public class DeporteController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDeporteService dService;
	private Deporte deporte;
	List<Deporte> listaDeportes;
	
	@PostConstruct
	public void init() {
		this.listaDeportes = new ArrayList<Deporte>();
		this.deporte = new Deporte();
		this.listar();
	}
	
	public String nuevoDeporte() {
		this.setDeporte(new Deporte());
		return "deporte.xhtml";
	}
	
	public void insertar() {
		dService.insertar(deporte);
		limpiarDeporte();
	}
	
	public void listar() {
		listaDeportes = dService.listar();
	}
	
	public void limpiarDeporte() {
		this.init();
	}
	
	public void eliminar(Deporte deporte) {
		dService.eliminar(deporte.getSportID());
		this.listar();
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

	

	
	
}
