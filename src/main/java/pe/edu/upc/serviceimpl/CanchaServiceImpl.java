package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICanchaDao;
import pe.edu.upc.entity.Cancha;
import pe.edu.upc.service.ICanchaService;

@Named
@RequestScoped

public class CanchaServiceImpl implements ICanchaService, Serializable{

	private static final long serialVersionUID = 1L;

	 @Inject
	 private ICanchaDao cD;

	@Override
	public void insertar(Cancha cancha) {
		cD.insertar(cancha);
	}

	@Override
	public List<Cancha> listar() {
		return cD.listar();
	}

	@Override
	public void eliminar(int canchaID) {
		cD.eliminar(canchaID);
	}

	 
	 
}
