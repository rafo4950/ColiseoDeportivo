package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CentroDeportivo;
import pe.edu.upc.service.ICentroDeportivoService;

@Named
@RequestScoped
public class CentroDeportivoController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICentroDeportivoService cdService;
	
	private CentroDeportivo centrodeportivo;
	List<CentroDeportivo> listaCentroDeportivos;
	
	
	@PostConstruct
	public void init() {
		this.listaCentroDeportivos = new ArrayList<CentroDeportivo>();
		this.centrodeportivo = new CentroDeportivo();

		this.listarCentroDeportivo();
	}
	
	public String nuevoCentroDeportivo() {
		this.setCentrodeportivo(new CentroDeportivo());
		return "centrodeportivo.xhtml";
	}
	
	public void insertar() {
		cdService.insertar(centrodeportivo);
		limpiarCentroDeportivo();
	}
	
	public void listarCentroDeportivo() {
		listaCentroDeportivos = cdService.listar();
	}
	
	public void limpiarCentroDeportivo() {
		this.init();
	}
	
	public void eliminar(CentroDeportivo centrodeportivo) {
		cdService.eliminar(centrodeportivo.getCentrodeportivoID());
		this.listarCentroDeportivo();
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
