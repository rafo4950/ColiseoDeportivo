package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDeporteDao;
import pe.edu.upc.entity.Deporte;
import pe.edu.upc.service.IDeporteService;

@Named
@RequestScoped

public class DeporteServiceImpl implements IDeporteService, Serializable{

	private static final long serialVersionUID = 1L;

	 @Inject
	 private IDeporteDao dD;

	@Override
	public void insertar(Deporte deporte) {
		dD.insertar(deporte);
	}

	@Override
	public List<Deporte> listar() {
		return dD.listar();
	}

	@Override
	public void eliminar(int sportID) {
		dD.eliminar(sportID);
	}

}
