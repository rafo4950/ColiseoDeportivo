package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="centrodeportivo")
public class CentroDeportivo implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int centrodeportivoID;
	
	@Column(name="centrodeportivoNombre", nullable=false, length=30)
	private String centrodeportivoNombre;
	
	@Column(name="centrodeportivoDireccion", nullable=false, length=100)
	private String centrodeportivoDireccion;

	public CentroDeportivo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CentroDeportivo(int centrodeportivoID, String centrodeportivoNombre, String centrodeportivoDireccion) {
		super();
		this.centrodeportivoID = centrodeportivoID;
		this.centrodeportivoNombre = centrodeportivoNombre;
		this.centrodeportivoDireccion = centrodeportivoDireccion;
	}

	public int getCentrodeportivoID() {
		return centrodeportivoID;
	}

	public void setCentrodeportivoID(int centrodeportivoID) {
		this.centrodeportivoID = centrodeportivoID;
	}

	public String getCentrodeportivoNombre() {
		return centrodeportivoNombre;
	}

	public void setCentrodeportivoNombre(String centrodeportivoNombre) {
		this.centrodeportivoNombre = centrodeportivoNombre;
	}

	public String getCentrodeportivoDireccion() {
		return centrodeportivoDireccion;
	}

	public void setCentrodeportivoDireccion(String centrodeportivoDireccion) {
		this.centrodeportivoDireccion = centrodeportivoDireccion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centrodeportivoDireccion == null) ? 0 : centrodeportivoDireccion.hashCode());
		result = prime * result + centrodeportivoID;
		result = prime * result + ((centrodeportivoNombre == null) ? 0 : centrodeportivoNombre.hashCode());
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
		CentroDeportivo other = (CentroDeportivo) obj;
		if (centrodeportivoDireccion == null) {
			if (other.centrodeportivoDireccion != null)
				return false;
		} else if (!centrodeportivoDireccion.equals(other.centrodeportivoDireccion))
			return false;
		if (centrodeportivoID != other.centrodeportivoID)
			return false;
		if (centrodeportivoNombre == null) {
			if (other.centrodeportivoNombre != null)
				return false;
		} else if (!centrodeportivoNombre.equals(other.centrodeportivoNombre))
			return false;
		return true;
	}

	
}
