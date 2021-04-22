package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
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
	
	@Column(name="numeroCancha", nullable=false)
	private int numeroCancha;
	
	@Column(name="precioCancha", nullable=false)
	private int precioCancha;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="sportID")
	private Deporte deporte;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="sedeID")
	private Sede sede;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="horarioID")
	private Horario horario;

	public Cancha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cancha(int canchaID, int numeroCancha, int precioCancha, Deporte deporte, Sede sede, Horario horario) {
		super();
		this.canchaID = canchaID;
		this.precioCancha = precioCancha;
		this.numeroCancha = numeroCancha;
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
	
	public int getNumeroCancha() {
		return numeroCancha;
	}

	public void setNumeroCancha(int numeroCancha) {
		this.numeroCancha = numeroCancha;
	}
	
	public int getPrecioCancha() {
		return precioCancha;
	}

	public void setPrecioCancha(int precioCancha) {
		this.precioCancha = precioCancha;
	}
	
	@Override
	public String toString() {
	    return String.format("%s[id=%d]", getClass().getSimpleName(), getCanchaID());
	}
}
