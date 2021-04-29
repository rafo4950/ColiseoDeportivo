package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CentroDeportivo;

public interface ICentroDeportivoDao {
	public void insertar(CentroDeportivo centrodeportivo);
	public List<CentroDeportivo> listar();
	public void eliminar(int centrodeportivoID);
}
