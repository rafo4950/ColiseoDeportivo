package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cancha")
public class Cancha implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int canchaID;
	
	@ManyToOne
	@JoinColumn(name="sportID", nullable = false)
	private Deporte deporte;
	
	@ManyToOne
	@JoinColumn(name="sedeID", nullable = false)
	private Sede sede;
	
	@ManyToOne
	@JoinColumn(name="horarioID", nullable = false)
	private Horario horario;

	public Cancha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cancha(int canchaID, Deporte deporte, Sede sede, Horario horario) {
		super();
		this.canchaID = canchaID;
		this.deporte = deporte;
		this.sede = sede;
		this.horario = horario;
	}

	public int getCanchaID() {
		return canchaID;
	}

	public void setCanchaID(int canchaID) {
		this.canchaID = canchaID;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
}
