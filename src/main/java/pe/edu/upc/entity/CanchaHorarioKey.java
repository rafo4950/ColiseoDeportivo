package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CanchaHorarioKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "canchaID")
	private int canchaID;

    @Column(name = "horarioID")
    private int horarioID;
    
    @Column(name = "deporteID")
    private int deporteID;
	
    public CanchaHorarioKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CanchaHorarioKey(int canchaID, int horarioID, int deporteID) {
		super();
		this.canchaID = canchaID;
		this.horarioID = horarioID;
		this.deporteID = deporteID;
	}

	public int getCanchaID() {
		return canchaID;
	}

	public void setCanchaID(int canchaID) {
		this.canchaID = canchaID;
	}

	public int getHorarioID() {
		return horarioID;
	}

	public void setHorarioID(int horarioID) {
		this.horarioID = horarioID;
	}

	public int getDeporteID() {
		return deporteID;
	}

	public void setDeporteID(int deporteID) {
		this.deporteID = deporteID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + canchaID;
		result = prime * result + deporteID;
		result = prime * result + horarioID;
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
		CanchaHorarioKey other = (CanchaHorarioKey) obj;
		if (canchaID != other.canchaID)
			return false;
		if (deporteID != other.deporteID)
			return false;
		if (horarioID != other.horarioID)
			return false;
		return true;
	}
	
}
