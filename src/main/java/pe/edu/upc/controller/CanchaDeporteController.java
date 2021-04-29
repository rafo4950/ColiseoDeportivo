package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CanchaDeporte;
import pe.edu.upc.service.ICanchaDeporteService;
import pe.edu.upc.entity.Cancha;
import pe.edu.upc.service.ICanchaService;
import pe.edu.upc.entity.Deporte;
import pe.edu.upc.service.IDeporteService;

@Named
@RequestScoped
public class CanchaDeporteController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICanchaDeporteService cadService;
	
	@Inject
	private ICanchaService cService;
	
	@Inject
	private IDeporteService dService;
	
	private CanchaDeporte canchadeporte;
	List<CanchaDeporte> listaCanchaDeportes;
	
	private Cancha cancha;
	List<Cancha> listaCanchas;
	
	private Deporte deporte;
	List<Deporte> listaDeportes;
	
	@PostConstruct
	public void init() {
		this.listaCanchaDeportes = new ArrayList<CanchaDeporte>();
		this.canchadeporte = new CanchaDeporte();
		this.listaCanchas = new ArrayList<Cancha>();
		this.cancha = new Cancha();
		this.listaDeportes = new ArrayList<Deporte>();
		this.deporte = new Deporte();

		this.listarCanchaDeporte();
		this.listarCanchas();
		this.listarDeportes();
	}
	
	public String nuevoCanchaDeporte() {
		this.setCanchadeporte(new CanchaDeporte());
		return "canchadeporte.xhtml";
	}
	
	public void insertar() {
		cadService.insertar(canchadeporte);
		limpiarCanchaDeporte();
	}
	
	public void listarCanchaDeporte() {
		listaCanchaDeportes = cadService.listar();
	}
	
	public void listarCanchas() {
		listaCanchas = cService.listar();
	}
	
	public void listarDeportes() {
		listaDeportes = dService.listar();
	}
	
	public void limpiarCanchaDeporte() {
		this.init();
	}
	
	public void eliminar(CanchaDeporte canchadeporte) {
		cadService.eliminar(canchadeporte.getCanchadeporteID());
		this.listarCanchaDeporte();
	}

	public CanchaDeporte getCanchadeporte() {
		return canchadeporte;
	}

	public void setCanchadeporte(CanchaDeporte canchadeporte) {
		this.canchadeporte = canchadeporte;
	}

	public List<CanchaDeporte> getListaCanchaDeportes() {
		return listaCanchaDeportes;
	}

	public void setListaCanchaDeportes(List<CanchaDeporte> listaCanchaDeportes) {
		this.listaCanchaDeportes = listaCanchaDeportes;
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

	
		
}
