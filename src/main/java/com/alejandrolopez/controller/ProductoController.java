package com.alejandrolopez.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alejandrolopez.model.Producto;
import com.alejandrolopez.service.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private IProductoService service;
	
	@GetMapping
	public List<Producto> listar(){
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Producto leerPorId(@PathVariable("id") Integer id) {
		return service.leerPorId(id);
	}
	
	@PostMapping
	public void registrar(@Valid @RequestBody Producto obj) {
		service.registrar(obj);
	}
	
	@PutMapping
	public void modificar(@Valid @RequestBody Producto obj) {
		service.modificar(obj);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
}
