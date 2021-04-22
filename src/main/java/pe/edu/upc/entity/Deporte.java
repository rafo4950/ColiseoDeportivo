package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deporte")
public class Deporte implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int sportID;
	
	@Column(name="sportNombre", nullable=false, length=30)
	private String sportNombre;
	

	public Deporte() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Deporte(int sportID, String sportNombre) {
		super();
		this.sportID = sportID;
		this.sportNombre = sportNombre;
	}


	public int getSportID() {
		return sportID;
	}


	public void setSportID(int sportID) {
		this.sportID = sportID;
	}


	public String getSportNombre() {
		return sportNombre;
	}


	public void setSportNombre(String sportNombre) {
		this.sportNombre = sportNombre;
	}
	
	@Override
	public String toString() {
	    return String.format("%s[id=%d]", getClass().getSimpleName(), getSportID());
	}

}
