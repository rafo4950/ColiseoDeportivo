package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sede")
public class Sede implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int sedeID;
	
	@Column(name="sedeNombre", nullable=false, length=30)
	private String sedeNombre;
	

	public Sede() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Sede(int sedeID, String sedeNombre) {
		super();
		this.sedeID = sedeID;
		this.sedeNombre = sedeNombre;
	}


	public int getSedeID() {
		return sedeID;
	}


	public void setSedeID(int sedeID) {
		this.sedeID = sedeID;
	}


	public String getSedeNombre() {
		return sedeNombre;
	}


	public void setSedeNombre(String sedeNombre) {
		this.sedeNombre = sedeNombre;
	}

	@Override
	public String toString() {
	    return String.format("%s[id=%d]", getClass().getSimpleName(), getSedeID());
	}
	
}
