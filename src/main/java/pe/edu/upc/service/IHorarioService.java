package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Horario;

public interface IHorarioService {
	public void insertar(Horario horario);
	public List<Horario> listar();
	public void eliminar(int horarioID);
}
