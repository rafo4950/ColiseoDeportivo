package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.ArrayList;
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinTable(
	        name = "canchas_deportes",
	        joinColumns = { @JoinColumn(name = "canchaid", nullable = false)},
	        inverseJoinColumns = {@JoinColumn(name="deporteid", nullable = false)}
    )
    private Set<Deporte> canchaDeportes = new HashSet<>();
	
	@OneToMany(mappedBy = "cancha", fetch = FetchType.EAGER)
    private Set<CanchaHorario> horarios;

	public Cancha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cancha(int canchaID, CentroDeportivo centrodeportivo, String canchaNombre) {
		super();
		this.canchaID = canchaID;
		this.centrodeportivo = centrodeportivo;
		this.canchaNombre = canchaNombre;
		this.canchaDeportes = new HashSet<>();
	}
	
	public void agregarDeporte(Deporte deporte){
        if(this.canchaDeportes == null){
            this.canchaDeportes = new HashSet<>();
        }
        
        this.canchaDeportes.add(deporte);
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

	public Set<Deporte> getCanchaDeportes() {
		return canchaDeportes;
	}

	public void setCanchaDeportes(Set<Deporte> canchaDeportes) {
		this.canchaDeportes = canchaDeportes;
	}

	public Set<CanchaHorario> getHorarios() {
		return horarios;
	}

	public void setHorarios(Set<CanchaHorario> horarios) {
		this.horarios = horarios;
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
