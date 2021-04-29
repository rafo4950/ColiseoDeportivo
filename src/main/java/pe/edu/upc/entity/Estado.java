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
	
	@Column(name="estadoNombre", nullable=false, length=30)
	private String estadoNombre;

	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estado(int estadoID, String estadoNombre) {
		super();
		this.estadoID = estadoID;
		this.estadoNombre = estadoNombre;
	}

	public int getEstadoID() {
		return estadoID;
	}

	public void setEstadoID(int estadoID) {
		this.estadoID = estadoID;
	}

	public String getEstadoNombre() {
		return estadoNombre;
	}

	public void setEstadoNombre(String estadoNombre) {
		this.estadoNombre = estadoNombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estadoID;
		result = prime * result + ((estadoNombre == null) ? 0 : estadoNombre.hashCode());
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
		Estado other = (Estado) obj;
		if (estadoID != other.estadoID)
			return false;
		if (estadoNombre == null) {
			if (other.estadoNombre != null)
				return false;
		} else if (!estadoNombre.equals(other.estadoNombre))
			return false;
		return true;
	}
	
	
}
