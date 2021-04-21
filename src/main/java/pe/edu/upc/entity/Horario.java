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
	
	@Column(name="horarioInicio", nullable=false, length=50)
	private String horarioInicio;
	
	@Column(name="horarioFin", nullable=false, length=50)
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
	
	
}
