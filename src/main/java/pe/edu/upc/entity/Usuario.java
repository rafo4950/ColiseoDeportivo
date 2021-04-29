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
	
	@Column(name="userContrasena", nullable=false, length=30)
	private String userContrasena;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int userID, String userNombre, String userPrimerApellido, String userSegundoApellido,
			Date userFechaNacimiento, String userCorreo, String userContrasena) {
		super();
		this.userID = userID;
		this.userNombre = userNombre;
		this.userPrimerApellido = userPrimerApellido;
		this.userSegundoApellido = userSegundoApellido;
		this.userFechaNacimiento = userFechaNacimiento;
		this.userCorreo = userCorreo;
		this.userContrasena = userContrasena;
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


	public String getUserContrasena() {
		return userContrasena;
	}

	public void setUserContrasena(String userContrasena) {
		this.userContrasena = userContrasena;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userContrasena == null) ? 0 : userContrasena.hashCode());
		result = prime * result + ((userCorreo == null) ? 0 : userCorreo.hashCode());
		result = prime * result + ((userFechaNacimiento == null) ? 0 : userFechaNacimiento.hashCode());
		result = prime * result + userID;
		result = prime * result + ((userNombre == null) ? 0 : userNombre.hashCode());
		result = prime * result + ((userPrimerApellido == null) ? 0 : userPrimerApellido.hashCode());
		result = prime * result + ((userSegundoApellido == null) ? 0 : userSegundoApellido.hashCode());
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
		Usuario other = (Usuario) obj;
		if (userContrasena == null) {
			if (other.userContrasena != null)
				return false;
		} else if (!userContrasena.equals(other.userContrasena))
			return false;
		if (userCorreo == null) {
			if (other.userCorreo != null)
				return false;
		} else if (!userCorreo.equals(other.userCorreo))
			return false;
		if (userFechaNacimiento == null) {
			if (other.userFechaNacimiento != null)
				return false;
		} else if (!userFechaNacimiento.equals(other.userFechaNacimiento))
			return false;
		if (userID != other.userID)
			return false;
		if (userNombre == null) {
			if (other.userNombre != null)
				return false;
		} else if (!userNombre.equals(other.userNombre))
			return false;
		if (userPrimerApellido == null) {
			if (other.userPrimerApellido != null)
				return false;
		} else if (!userPrimerApellido.equals(other.userPrimerApellido))
			return false;
		if (userSegundoApellido == null) {
			if (other.userSegundoApellido != null)
				return false;
		} else if (!userSegundoApellido.equals(other.userSegundoApellido))
			return false;
		return true;
	}

}
