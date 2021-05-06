package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CanchaHorario;
import pe.edu.upc.entity.CanchaHorarioKey;
import pe.edu.upc.entity.Deporte;
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
	
	private List<CanchaHorario> listaCanchaHorarios;
	
	private List<Cancha> listaCanchas;
	
	private List<Horario> listaHorarios;
	
	private List<Horario> listaHorariosDisponibles;
			
	private int precioCancha;
	
	private Deporte deporte;
	
	private Cancha cancha; 
	
	private Horario horario;

	private CanchaHorario canchahorario;
	
	@PostConstruct
	public void init() {
		this.listaCanchas = new ArrayList<Cancha>();
		this.listarCanchas();
		this.listarCanchaHorario();
		this.listarHorarios();
	}
	
	public void nuevoCanchaHorario() {
		this.listarCanchas();
		this.setCanchahorario(new CanchaHorario());
	}
	
	public void insertar() {
		cahService.insertar(new CanchaHorario(
				new CanchaHorarioKey(
				canchahorario.getCancha().getCanchaID(),
				canchahorario.getHorario().getHorarioID(),
				canchahorario.getDeporte().getDeporteID()
				), canchahorario.getCanchahorarioPrecio()));
		limpiarCanchaHorario();
	}
	
	public List<Horario> listarDisponiblesHorariosPorDeporte() {
//		List<Horario> nuevosHorarios = hService.listar();
//		List<Horario> horariosDisponibles = new ArrayList<Horario>();
//		for (int i = 0; i < nuevosHorarios.size(); i++) {
//			Horario horarioActual = nuevosHorarios.get(i);
//			boolean existe = false;
//			for (int j = 0; j < listaCanchaHorarios.size(); j++) {
//				CanchaHorario canchaHorarioActual = listaCanchaHorarios.get(j);
//				if (horarioActual.getHorarioID() == canchaHorarioActual.getHorario().getHorarioID() ) {
//					if (deporte == null || deporte.getDeporteID() == canchaHorarioActual.getDeporte().getDeporteID()) {
//						existe = true;
//					} else {
//						existe = true;
//					}
//				}
//			}
//			if (!existe) {
//				horariosDisponibles.add(horarioActual);
//			}
//			
//		}
		return listaHorarios;	
	}
	
	public void handleCancha() {
		cancha = canchahorario.getCancha();
		precioCancha = 0;
		listaHorariosDisponibles = new ArrayList<>();
		if (cancha.getCanchaDeportes().size() > 0) {
			canchahorario.setDeporte((new ArrayList<Deporte>(cancha.getCanchaDeportes())).get(0));
			listaHorariosDisponibles = listarDisponiblesHorariosPorDeporte();
			if (listaHorariosDisponibles.size() > 0) {
				canchahorario.setHorario(listaHorariosDisponibles.get(0));
			}
		}
	}
	
	public void handleDeporte() {
		precioCancha = 0;
		listaHorariosDisponibles = listarDisponiblesHorariosPorDeporte();
		if (listaHorariosDisponibles.size() > 0) {
			canchahorario.setHorario(listaHorariosDisponibles.get(0));
		}
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
	
	
	public List<Horario> getListaHorarios() {
		return listaHorarios;
	}

	public void setListaHorarios(List<Horario> listaHorarios) {
		this.listaHorarios = listaHorarios;
	}

	public void limpiarCanchaHorario() {
		this.init();
	}
	
	public void eliminar(CanchaHorario canchahorario) {
		cahService.eliminar(canchahorario.getId());
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

	public List<Horario> getListaHorariosDisponibles() {
		return listaHorariosDisponibles;
	}

	public void setListaHorariosDisponibles(List<Horario> listaHorariosDisponibles) {
		this.listaHorariosDisponibles = listaHorariosDisponibles;
	}

	public int getPrecioCancha() {
		return precioCancha;
	}

	public void setPrecioCancha(int precioCancha) {
		this.precioCancha = precioCancha;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	
	
		
}
