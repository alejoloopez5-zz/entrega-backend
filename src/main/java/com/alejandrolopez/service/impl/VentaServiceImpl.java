package com.alejandrolopez.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alejandrolopez.model.Venta;
import com.alejandrolopez.repo.IVentaRepo;
import com.alejandrolopez.service.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService {
	
	@Autowired
	private IVentaRepo venta;
	
	@Override
	public Venta registrar(Venta obj) {
		obj.getIdPersona();				
		return venta.save(obj);
	}

	@Override
	public Venta modificar(Venta t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Venta leerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venta> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
