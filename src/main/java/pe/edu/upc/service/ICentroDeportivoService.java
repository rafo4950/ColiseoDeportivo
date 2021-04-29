package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CentroDeportivo;

public interface ICentroDeportivoService {
	public void insertar(CentroDeportivo centrodeportivo);
	public List<CentroDeportivo> listar();
	public void eliminar(int centrodeportivoID);
}
