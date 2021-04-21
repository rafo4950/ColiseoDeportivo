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

@Named
@RequestScoped
public class CanchaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICanchaService cService;

	Cancha cancha;
	List<Cancha> listaCanchas;
	
	@PostConstruct
	public void init() {
		this.listaCanchas = new ArrayList<Cancha>();
		this.cancha = new Cancha();
	
		this.listarCancha();
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
	
}
