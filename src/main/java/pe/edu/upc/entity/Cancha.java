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
	
	@ManyToOne(optional = false)
	@JoinColumn(name="centrodeportivoID")
	private CentroDeportivo centrodeportivo;
	
	@Column(name="canchaNombre", nullable=false, length=30)
	private String canchaNombre;

	public Cancha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cancha(int canchaID, CentroDeportivo centrodeportivo, String canchaNombre) {
		super();
		this.canchaID = canchaID;
		this.centrodeportivo = centrodeportivo;
		this.canchaNombre = canchaNombre;
	}

	public int getCanchaID() {
		return canchaID;
	}

	public void setCanchaID(int canchaID) {
		this.canchaID = canchaID;
	}

	public CentroDeportivo getCentrodeportivo() {
		return centrodeportivo;
	}

	public void setCentrodeportivo(CentroDeportivo centrodeportivo) {
		this.centrodeportivo = centrodeportivo;
	}

	public String getCanchaNombre() {
		return canchaNombre;
	}

	public void setCanchaNombre(String canchaNombre) {
		this.canchaNombre = canchaNombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + canchaID;
		result = prime * result + ((canchaNombre == null) ? 0 : canchaNombre.hashCode());
		result = prime * result + ((centrodeportivo == null) ? 0 : centrodeportivo.hashCode());
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
		Cancha other = (Cancha) obj;
		if (canchaID != other.canchaID)
			return false;
		if (canchaNombre == null) {
			if (other.canchaNombre != null)
				return false;
		} else if (!canchaNombre.equals(other.canchaNombre))
			return false;
		if (centrodeportivo == null) {
			if (other.centrodeportivo != null)
				return false;
		} else if (!centrodeportivo.equals(other.centrodeportivo))
			return false;
		return true;
	}

	
	
}
