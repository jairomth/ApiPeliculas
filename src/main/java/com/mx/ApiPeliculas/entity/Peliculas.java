package com.mx.ApiPeliculas.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PELICULAS")
public class Peliculas implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "PRECIO")
	private Float precio;
	
	@Column(name = "FECHA_LANZ")
	private Date fecha_lanz;
	
	@Column(name = "GENERO")
	private String genero;

	
	
	public Peliculas() {
	}
	
	
	
	public Peliculas(Long id, String nombre, Float precio, Date fecha_lanz, String genero) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha_lanz = fecha_lanz;
		this.genero = genero;
	}



	@Override
	public String toString() {
		return "Peliculas [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fecha_lanz=" + fecha_lanz
				+ ", genero=" + genero + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Date getFecha_lanz() {
		return fecha_lanz;
	}

	public void setFecha_lanz(Date fecha_lanz) {
		this.fecha_lanz = fecha_lanz;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}