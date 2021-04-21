package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Horario;

public interface IHorarioDao {
	public void insertar(Horario horario);
	public List<Horario> listar();
	public void eliminar(int horarioID);
}
