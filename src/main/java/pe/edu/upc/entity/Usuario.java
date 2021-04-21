package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int userID;
	
	@Column(name="userNombre", nullable=false, length=30)
	private String userNombre;
	
	@Column(name="userPrimerApellido", nullable=false, length=30)
	private String userPrimerApellido;
	
	@Column(name="userSegundoApellido", nullable=false, length=30)
	private String userSegundoApellido;
	
	private Date userFechaNacimiento;

	@Column(name="userCorreo", nullable=false, length=50)
	private String userCorreo;
	
	@Column(name="userContraseņa", nullable=false, length=30)
	private String userContraseņa;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int userID, String userNombre, String userPrimerApellido, String userSegundoApellido,
			Date userFechaNacimiento, String userCorreo, String userContraseņa) {
		super();
		this.userID = userID;
		this.userNombre = userNombre;
		this.userPrimerApellido = userPrimerApellido;
		this.userSegundoApellido = userSegundoApellido;
		this.userFechaNacimiento = userFechaNacimiento;
		this.userCorreo = userCorreo;
		this.userContraseņa = userContraseņa;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserNombre() {
		return userNombre;
	}

	public void setUserNombre(String userNombre) {
		this.userNombre = userNombre;
	}

	public String getUserPrimerApellido() {
		return userPrimerApellido;
	}

	public void setUserPrimerApellido(String userPrimerApellido) {
		this.userPrimerApellido = userPrimerApellido;
	}

	public String getUserSegundoApellido() {
		return userSegundoApellido;
	}

	public void setUserSegundoApellido(String userSegundoApellido) {
		this.userSegundoApellido = userSegundoApellido;
	}

	public Date getUserFechaNacimiento() {
		return userFechaNacimiento;
	}

	public void setUserFechaNacimiento(Date userFechaNacimiento) {
		this.userFechaNacimiento = userFechaNacimiento;
	}

	public String getUserCorreo() {
		return userCorreo;
	}

	public void setUserCorreo(String userCorreo) {
		this.userCorreo = userCorreo;
	}


	public String getUserContraseņa() {
		return userContraseņa;
	}

	public void setUserContraseņa(String userContraseņa) {
		this.userContraseņa = userContraseņa;
	}

}
