package pe.edu.upc.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="canchadeporte")
public class CanchaDeporte implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int canchadeporteID;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="canchaID")
	private Cancha cancha;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="deporteID")
	private Deporte deporte;

	public CanchaDeporte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CanchaDeporte(int canchadeporteID, Cancha cancha, Deporte deporte) {
		super();
		this.canchadeporteID = canchadeporteID;
		this.cancha = cancha;
		this.deporte = deporte;
	}

	public int getCanchadeporteID() {
		return canchadeporteID;
	}

	public void setCanchadeporteID(int canchadeporteID) {
		this.canchadeporteID = canchadeporteID;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	
	
}
