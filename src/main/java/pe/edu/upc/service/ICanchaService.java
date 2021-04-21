package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Cancha;

public interface ICanchaService {
	public void insertar(Cancha cancha);
	public List<Cancha> listar();
	public void eliminar(int canchaID);
}
