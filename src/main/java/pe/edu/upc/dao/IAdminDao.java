package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Admin;

public interface IAdminDao {
	public void insertar(Admin admin);
	public List<Admin> listar();
	public void eliminar(int adminID);
}
