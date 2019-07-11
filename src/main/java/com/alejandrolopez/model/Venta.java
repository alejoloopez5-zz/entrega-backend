package com.alejandrolopez.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ventas")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVenta;
	
	
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name= "id_Persona", nullable = false, foreignKey = @ForeignKey(name = "fk_venta_persona"))
	private Persona idPersona;
	
	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Persona getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	private Double importe;
	
}
