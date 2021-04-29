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
import pe.edu.upc.entity.CentroDeportivo;
import pe.edu.upc.service.ICentroDeportivoService;

@Named
@RequestScoped
public class CanchaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICanchaService cService;
	
	@Inject
	private ICentroDeportivoService cdService;
	
	private Cancha cancha;
	List<Cancha> listaCanchas;
	
	private CentroDeportivo centrodeportivo;
	List<CentroDeportivo> listaCentroDeportivos;
	
	
	@PostConstruct
	public void init() {
		this.listaCanchas = new ArrayList<Cancha>();
		this.cancha = new Cancha();
		this.listaCentroDeportivos = new ArrayList<CentroDeportivo>();
		this.centrodeportivo = new CentroDeportivo();

		this.listarCancha();
		this.listarCentroDeportivos();
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
	
	public void listarCentroDeportivos() {
		listaCentroDeportivos = cdService.listar();
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
