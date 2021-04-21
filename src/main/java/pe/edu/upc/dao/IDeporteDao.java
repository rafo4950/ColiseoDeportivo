package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Deporte;

public interface IDeporteDao {
	public void insertar(Deporte deporte);
	public List<Deporte> listar();
	public void eliminar(int sportID);
}
