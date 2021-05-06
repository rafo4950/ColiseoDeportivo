package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CanchaHorario;
import pe.edu.upc.entity.CanchaHorarioKey;

public interface ICanchaHorarioDao {
	public void insertar(CanchaHorario canchahorario);
	public List<CanchaHorario> listar();
	public void eliminar(CanchaHorarioKey canchahorarioID);
}
