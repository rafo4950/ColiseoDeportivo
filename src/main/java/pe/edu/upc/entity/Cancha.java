package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cancha")
public class Cancha implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int canchaID;
	

	public Cancha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cancha(int canchaID) {
		super();
		this.canchaID = canchaID;
	}

	public int getCanchaID() {
		return canchaID;
	}

	public void setCanchaID(int canchaID) {
		this.canchaID = canchaID;
	}
	
}
