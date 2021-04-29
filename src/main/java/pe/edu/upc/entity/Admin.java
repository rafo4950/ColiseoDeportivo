package pe.edu.upc.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int adminID;
	
	@OneToOne(optional = false)
	@JoinColumn(name="userID")
	private Usuario usuario;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="centrodeportivoID")
	private CentroDeportivo centrodeportivo;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminID, Usuario usuario, CentroDeportivo centrodeportivo) {
		super();
		this.adminID = adminID;
		this.usuario = usuario;
		this.centrodeportivo = centrodeportivo;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public CentroDeportivo getCentrodeportivo() {
		return centrodeportivo;
	}

	public void setCentrodeportivo(CentroDeportivo centrodeportivo) {
		this.centrodeportivo = centrodeportivo;
	}
	
}
