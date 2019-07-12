package com.alejandrolopez.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alejandrolopez.model.Venta;
import com.alejandrolopez.service.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	
	@Autowired
	private IVentaService service;
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody Venta obj){
		service.registrar(obj);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
	
}
