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
	
	@ManyToOne(optional = false)
	@JoinColumn(name="clienteID")
	private Cliente cliente;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="canchahorarioID")
	private CanchaHorario canchahorario;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="estadoID")
	private Estado estado;

	private Date reservaFecha;
	
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(int reservaID, Cliente cliente, CanchaHorario canchahorario, Estado estado, Date reservaFecha) {
		super();
		this.reservaID = reservaID;
		this.cliente = cliente;
		this.canchahorario = canchahorario;
		this.estado = estado;
		this.reservaFecha = reservaFecha;
	}

	public int getReservaID() {
		return reservaID;
	}

	public void setReservaID(int reservaID) {
		this.reservaID = reservaID;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public CanchaHorario getCanchahorario() {
		return canchahorario;
	}

	public void setCanchahorario(CanchaHorario canchahorario) {
		this.canchahorario = canchahorario;
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
