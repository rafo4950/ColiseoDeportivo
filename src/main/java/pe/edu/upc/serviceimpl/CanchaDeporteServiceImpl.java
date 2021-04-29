package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICanchaDeporteDao;
import pe.edu.upc.entity.CanchaDeporte;
import pe.edu.upc.service.ICanchaDeporteService;

@Named
@RequestScoped

public class CanchaDeporteServiceImpl implements ICanchaDeporteService, Serializable{

	private static final long serialVersionUID = 1L;

	 @Inject
	 private ICanchaDeporteDao cadD;
	
	@Override
	public void insertar(CanchaDeporte canchadeporte) {
		cadD.insertar(canchadeporte);
	}

	@Override
	public List<CanchaDeporte> listar() {
		return cadD.listar();
	}

	@Override
	public void eliminar(int canchadeporteID) {
		cadD.eliminar(canchadeporteID);
	}

}
