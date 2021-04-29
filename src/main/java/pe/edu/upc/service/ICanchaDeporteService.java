package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CanchaDeporte;

public interface ICanchaDeporteService {
	public void insertar(CanchaDeporte canchadeporte);
	public List<CanchaDeporte> listar();
	public void eliminar(int canchadeporteID);
}
