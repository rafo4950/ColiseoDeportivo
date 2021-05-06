package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICanchaHorarioDao;
import pe.edu.upc.entity.CanchaHorario;
import pe.edu.upc.entity.CanchaHorarioKey;
import pe.edu.upc.service.ICanchaHorarioService;

@Named
@RequestScoped

public class CanchaHorarioServiceImpl implements ICanchaHorarioService, Serializable{

	private static final long serialVersionUID = 1L;

	 @Inject
	 private ICanchaHorarioDao cahD;
	
	@Override
	public void insertar(CanchaHorario canchahorario) {
		cahD.insertar(canchahorario);
	}

	@Override
	public List<CanchaHorario> listar() {
		return cahD.listar();
	}

	@Override
	public void eliminar(CanchaHorarioKey canchahorarioID) {
		cahD.eliminar(canchahorarioID);
	}

}
