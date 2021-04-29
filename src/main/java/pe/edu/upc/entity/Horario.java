package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="horario")
public class Horario implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int horarioID;
	
	@Column(name="horarioInicio", nullable=false, length=30)
	private String horarioInicio;
	
	@Column(name="horarioFin", nullable=false, length=30)
	private String horarioFin;

	public Horario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Horario(int horarioID, String horarioInicio, String horarioFin) {
		super();
		this.horarioID = horarioID;
		this.horarioInicio = horarioInicio;
		this.horarioFin = horarioFin;
	}

	public int getHorarioID() {
		return horarioID;
	}

	public void setHorarioID(int horarioID) {
		this.horarioID = horarioID;
	}

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getHorarioFin() {
		return horarioFin;
	}

	public void setHorarioFin(String horarioFin) {
		this.horarioFin = horarioFin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horarioFin == null) ? 0 : horarioFin.hashCode());
		result = prime * result + horarioID;
		result = prime * result + ((horarioInicio == null) ? 0 : horarioInicio.hashCode());
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
		Horario other = (Horario) obj;
		if (horarioFin == null) {
			if (other.horarioFin != null)
				return false;
		} else if (!horarioFin.equals(other.horarioFin))
			return false;
		if (horarioID != other.horarioID)
			return false;
		if (horarioInicio == null) {
			if (other.horarioInicio != null)
				return false;
		} else if (!horarioInicio.equals(other.horarioInicio))
			return false;
		return true;
	}
	
	
}
