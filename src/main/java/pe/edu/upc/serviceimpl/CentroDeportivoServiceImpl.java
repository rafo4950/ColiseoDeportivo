package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICentroDeportivoDao;
import pe.edu.upc.entity.CentroDeportivo;
import pe.edu.upc.service.ICentroDeportivoService;

@Named
@RequestScoped

public class CentroDeportivoServiceImpl implements ICentroDeportivoService, Serializable{

	private static final long serialVersionUID = 1L;

	 @Inject
	 private ICentroDeportivoDao cdD;
	
	@Override
	public void insertar(CentroDeportivo centrodeportivo) {
		cdD.insertar(centrodeportivo);
	}

	@Override
	public List<CentroDeportivo> listar() {
		return cdD.listar();
	}

	@Override
	public void eliminar(int centrodeportivoID) {
		cdD.eliminar(centrodeportivoID);
	}

}
