package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CanchaDeporte;

public interface ICanchaDeporteDao {
	public void insertar(CanchaDeporte canchadeporte);
	public List<CanchaDeporte> listar();
	public void eliminar(int canchadeporteID);
}
