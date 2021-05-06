package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="deporte")
public class Deporte implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int deporteID;
	
	@Column(name="deporteNombre", nullable=false, length=30)
	private String deporteNombre;
	
	@ManyToMany(mappedBy = "canchaDeportes")
    private Set<Cancha> canchas = new HashSet<>();;

	public Deporte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deporte(int deporteID, String deporteNombre) {
		super();
		this.deporteID = deporteID;
		this.deporteNombre = deporteNombre;
	}

	public int getDeporteID() {
		return deporteID;
	}

	public void setDeporteID(int deporteID) {
		this.deporteID = deporteID;
	}

	public String getDeporteNombre() {
		return deporteNombre;
	}

	public void setDeporteNombre(String deporteNombre) {
		this.deporteNombre = deporteNombre;
	}
	

	public Set<Cancha> getCanchas() {
		return canchas;
	}

	public void setCanchas(Set<Cancha> deporteCanchas) {
		this.canchas = deporteCanchas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deporteID;
		result = prime * result + ((deporteNombre == null) ? 0 : deporteNombre.hashCode());
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
		Deporte other = (Deporte) obj;
		if (deporteID != other.deporteID)
			return false;
		if (deporteNombre == null) {
			if (other.deporteNombre != null)
				return false;
		} else if (!deporteNombre.equals(other.deporteNombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
	    return String.format("%s[id=%d]", getClass().getSimpleName(), getDeporteID());
	}
	
	
}
