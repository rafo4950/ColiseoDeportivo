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
@Table(name="canchahorario")
public class CanchaHorario implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int canchahorarioID;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="canchaID")
	private Cancha cancha;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="horarioID")
	private Horario horario;
	
	@Column(name="canchahorarioDisponibilidad")
	private boolean canchahorarioDisponibilidad;
	
	@Column(name="canchahorarioPrecio", nullable=false)
	private float canchahorarioPrecio;

	public CanchaHorario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CanchaHorario(int canchahorarioID, Cancha cancha, Horario horario, boolean canchahorarioDisponibilidad,
			float canchahorarioPrecio) {
		super();
		this.canchahorarioID = canchahorarioID;
		this.cancha = cancha;
		this.horario = horario;
		this.canchahorarioDisponibilidad = canchahorarioDisponibilidad;
		this.canchahorarioPrecio = canchahorarioPrecio;
	}

	public int getCanchahorarioID() {
		return canchahorarioID;
	}

	public void setCanchahorarioID(int canchahorarioID) {
		this.canchahorarioID = canchahorarioID;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public boolean isCanchahorarioDisponibilidad() {
		return canchahorarioDisponibilidad;
	}

	public void setCanchahorarioDisponibilidad(boolean canchahorarioDisponibilidad) {
		this.canchahorarioDisponibilidad = canchahorarioDisponibilidad;
	}

	public float getCanchahorarioPrecio() {
		return canchahorarioPrecio;
	}

	public void setCanchahorarioPrecio(float canchahorarioPrecio) {
		this.canchahorarioPrecio = canchahorarioPrecio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cancha == null) ? 0 : cancha.hashCode());
		result = prime * result + (canchahorarioDisponibilidad ? 1231 : 1237);
		result = prime * result + canchahorarioID;
		result = prime * result + Float.floatToIntBits(canchahorarioPrecio);
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CanchaHorario other = (CanchaHorario) obj;
		if (cancha == null) {
			if (other.cancha != null)
				return false;
		} else if (!cancha.equals(other.cancha))
			return false;
		if (canchahorarioDisponibilidad != other.canchahorarioDisponibilidad)
			return false;
		if (canchahorarioID != other.canchahorarioID)
			return false;
		if (Float.floatToIntBits(canchahorarioPrecio) != Float.floatToIntBits(other.canchahorarioPrecio))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		return true;
	}

	
}
