package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IReservaDao;
import pe.edu.upc.entity.Reserva;
import pe.edu.upc.service.IReservaService;

@Named
@RequestScoped

public class ReservaServiceImpl implements IReservaService, Serializable{

	private static final long serialVersionUID = 1L;

	 @Inject
	 private IReservaDao rD;
	
	@Override
	public void insertar(Reserva reserva) {
		rD.insertar(reserva);
	}

	@Override
	public List<Reserva> listar() {
		return rD.listar();
	}

	@Override
	public void eliminar(int reservaID) {
		rD.eliminar(reservaID);
	}

}
