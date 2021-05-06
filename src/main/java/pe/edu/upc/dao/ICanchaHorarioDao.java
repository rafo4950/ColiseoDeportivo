package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CanchaHorario;

public interface ICanchaHorarioDao {
	public void insertar(CanchaHorario canchahorario);
	public List<CanchaHorario> listar();
	public void eliminar(int canchahorarioID);
}
