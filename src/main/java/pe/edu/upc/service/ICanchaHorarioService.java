package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CanchaHorario;

public interface ICanchaHorarioService {
	public void insertar(CanchaHorario canchahorario);
	public List<CanchaHorario> listar();
	public void eliminar(int canchahorarioID);
}
