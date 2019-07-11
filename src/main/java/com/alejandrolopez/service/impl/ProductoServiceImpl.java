package com.alejandrolopez.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alejandrolopez.model.Producto;
import com.alejandrolopez.repo.IProductoRepo;
import com.alejandrolopez.service.IProductoService;

public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo producto; 
	
	@Override
	public Producto registrar(Producto obj) {		
		return producto.save(obj);
	}

	@Override
	public Producto modificar(Producto obj) { 
		return producto.save(obj);
	}

	@Override
	public Producto leerPorId(Integer id) {		
		return producto.findOne(id);
	}

	@Override
	public List<Producto> listar() { 
		return producto.findAll();
	}

	@Override
	public void eliminar(Integer id) {		
		producto.delete(id);
	}

}
