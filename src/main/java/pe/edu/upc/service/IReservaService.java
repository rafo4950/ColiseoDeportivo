package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Reserva;

public interface IReservaService {
	public void insertar(Reserva reserva);
	public List<Reserva> listar();
	public void eliminar(int reservaID);
}
