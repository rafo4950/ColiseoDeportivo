package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Sede;

public interface ISedeDao {
	public void insertar(Sede sede);
	public List<Sede> listar();
	public void eliminar(int sedeID);
}
