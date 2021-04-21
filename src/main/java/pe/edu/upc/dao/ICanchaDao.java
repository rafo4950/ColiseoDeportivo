package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Cancha;

public interface ICanchaDao {
	public void insertar(Cancha cancha);
	public List<Cancha> listar();
	public void eliminar(int canchaID);
}
