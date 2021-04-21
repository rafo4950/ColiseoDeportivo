package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Admin;

public interface IAdminService {
	public void insertar(Admin admin);
	public List<Admin> listar();
	public void eliminar(int adminID);
}
