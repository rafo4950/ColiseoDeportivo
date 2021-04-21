package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reserva")
public class Reserva implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int reservaID;
	
	@ManyToOne
	@JoinColumn(name="userID", nullable = false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="canchaID", nullable = false)
	private Cancha cancha;
	
	@ManyToOne
	@JoinColumn(name="estadoID", nullable = false)
	private Estado estado;
	
	private Date reservaFecha;

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(int reservaID, Usuario usuario, Cancha cancha, Estado estado, Date reservaFecha) {
		super();
		this.reservaID = reservaID;
		this.usuario = usuario;
		this.cancha = cancha;
		this.estado = estado;
		this.reservaFecha = reservaFecha;
	}

	public int getReservaID() {
		return reservaID;
	}

	public void setReservaID(int reservaID) {
		this.reservaID = reservaID;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Date getReservaFecha() {
		return reservaFecha;
	}

	public void setReservaFecha(Date reservaFecha) {
		this.reservaFecha = reservaFecha;
	}

	
}
