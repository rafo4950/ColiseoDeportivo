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
@Table(name="administrador")
public class Admin implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int adminID;
	
	@Column(name="adminNombre", nullable=false, length=30)
	private String adminNombre;
	
	@Column(name="adminPrimerApellido", nullable=false, length=30)
	private String adminPrimerApellido;
	
	@Column(name="adminSegundoApellido", nullable=false, length=30)
	private String adminSegundoApellido;
	
	private Date adminFechaNacimiento;

	@Column(name="adminCorreo", nullable=false, length=50)
	private String adminCorreo;
	
	@Column(name="adminAlias", nullable=false, length=30)
	private String adminAlias;
	
	@Column(name="adminContraseña", nullable=false, length=30)
	private String adminContraseña;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminID, String adminNombre, String adminPrimerApellido, String adminSegundoApellido,
			Date adminFechaNacimiento, String adminCorreo, String adminAlias, String adminContraseña) {
		super();
		this.adminID = adminID;
		this.adminNombre = adminNombre;
		this.adminPrimerApellido = adminPrimerApellido;
		this.adminSegundoApellido = adminSegundoApellido;
		this.adminFechaNacimiento = adminFechaNacimiento;
		this.adminCorreo = adminCorreo;
		this.adminAlias = adminAlias;
		this.adminContraseña = adminContraseña;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public String getAdminNombre() {
		return adminNombre;
	}

	public void setAdminNombre(String adminNombre) {
		this.adminNombre = adminNombre;
	}

	public String getAdminPrimerApellido() {
		return adminPrimerApellido;
	}

	public void setAdminPrimerApellido(String adminPrimerApellido) {
		this.adminPrimerApellido = adminPrimerApellido;
	}

	public String getAdminSegundoApellido() {
		return adminSegundoApellido;
	}

	public void setAdminSegundoApellido(String adminSegundoApellido) {
		this.adminSegundoApellido = adminSegundoApellido;
	}

	public Date getAdminFechaNacimiento() {
		return adminFechaNacimiento;
	}

	public void setAdminFechaNacimiento(Date adminFechaNacimiento) {
		this.adminFechaNacimiento = adminFechaNacimiento;
	}

	public String getAdminCorreo() {
		return adminCorreo;
	}

	public void setAdminCorreo(String adminCorreo) {
		this.adminCorreo = adminCorreo;
	}

	public String getAdminAlias() {
		return adminAlias;
	}

	public void setAdminAlias(String adminAlias) {
		this.adminAlias = adminAlias;
	}

	public String getAdminContraseña() {
		return adminContraseña;
	}

	public void setAdminContraseña(String adminContraseña) {
		this.adminContraseña = adminContraseña;
	}

	

}
