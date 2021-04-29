package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Reserva;

public interface IReservaDao {
	public void insertar(Reserva reserva);
	public List<Reserva> listar();
	public void eliminar(int reservaID);
}
