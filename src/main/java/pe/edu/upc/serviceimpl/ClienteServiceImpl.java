package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IClienteDao;
import pe.edu.upc.entity.Cliente;
import pe.edu.upc.service.IClienteService;

@Named
@RequestScoped

public class ClienteServiceImpl implements IClienteService, Serializable{

	private static final long serialVersionUID = 1L;

	 @Inject
	 private IClienteDao clD;
	
	@Override
	public void insertar(Cliente cliente) {
		clD.insertar(cliente);
	}

	@Override
	public List<Cliente> listar() {
		return clD.listar();
	}

	@Override
	public void eliminar(int clienteID) {
		clD.eliminar(clienteID);
	}

}
