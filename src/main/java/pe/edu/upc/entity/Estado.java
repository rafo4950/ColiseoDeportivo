package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estado")
public class Estado implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int estadoID;
	
	@Column(name="descripcionEstado", nullable=false, length=30)
	private String descripcionEstado;
	

	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Estado(int estadoID, String descripcionEstado) {
		super();
		this.estadoID = estadoID;
		this.descripcionEstado = descripcionEstado;
	}


	public int getEstadoID() {
		return estadoID;
	}


	public void setEstadoID(int estadoID) {
		this.estadoID = estadoID;
	}


	public String getDescripcionEstado() {
		return descripcionEstado;
	}


	public void setDescripcionEstado(String descripcionEstado) {
		this.descripcionEstado = descripcionEstado;
	}
	
}
