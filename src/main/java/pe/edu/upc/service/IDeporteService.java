package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Deporte;

public interface IDeporteService {
	public void insertar(Deporte deporte);
	public List<Deporte> listar();
	public void eliminar(int sportID);
}
