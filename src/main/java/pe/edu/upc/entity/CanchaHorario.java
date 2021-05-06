package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="canchahorario")
public class CanchaHorario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CanchaHorarioKey id;
	
	@ManyToOne
    @MapsId("canchaID")
	@JoinColumn(name="canchaID")
	private Cancha cancha;
	
	@ManyToOne
	@MapsId("horarioID")
	@JoinColumn(name="horarioID")
	private Horario horario;
	
	@ManyToOne
	@MapsId("deporteID")
	@JoinColumn(name="deporteID")
	private Deporte deporte;
	
	@Column(name="canchahorarioPrecio", nullable=false)
	private float canchahorarioPrecio;

	public CanchaHorario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CanchaHorario(CanchaHorarioKey id, float canchahorarioPrecio) {
		super();
		this.id = id;
		this.canchahorarioPrecio = canchahorarioPrecio;
	}


	public CanchaHorarioKey getId() {
		return id;
	}

	public void setId(CanchaHorarioKey id) {
		this.id = id;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public float getCanchahorarioPrecio() {
		return canchahorarioPrecio;
	}

	public void setCanchahorarioPrecio(float canchahorarioPrecio) {
		this.canchahorarioPrecio = canchahorarioPrecio;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cancha == null) ? 0 : cancha.hashCode());
		result = prime * result + Float.floatToIntBits(canchahorarioPrecio);
		result = prime * result + ((deporte == null) ? 0 : deporte.hashCode());
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CanchaHorario other = (CanchaHorario) obj;
		if (cancha == null) {
			if (other.cancha != null)
				return false;
		} else if (!cancha.equals(other.cancha))
			return false;
		if (Float.floatToIntBits(canchahorarioPrecio) != Float.floatToIntBits(other.canchahorarioPrecio))
			return false;
		if (deporte == null) {
			if (other.deporte != null)
				return false;
		} else if (!deporte.equals(other.deporte))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

	
}
