package com.leonel.mycontrol.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "personas")
public class Personas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 5, max = 200)
	private String nombre;
	@Size(min = 5, max = 200)
	private String apellido;
	@Size(min = 5, max = 200)
	private String rut;
	@Size(min = 5, max = 200)
	private String fechaNacimiento;

	@OneToMany(mappedBy = "personas", fetch = FetchType.LAZY)
	private List<Departamentos> misPropiedades = null;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departamento_id")
	private Departamentos resideEn = null;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	public Personas() {

	}

	public Personas(String nombre, String apellido, String rut, String fechaNacimiento,
			List<Departamentos> departamentos, Departamentos departamentos1) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.fechaNacimiento = fechaNacimiento;
		this.misPropiedades = departamentos;
		this.resideEn = departamentos1;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	

	public List<Departamentos> getMisPropiedades() {
		return misPropiedades;
	}

	public void setMisPropiedades(List<Departamentos> departamentos) {
		this.misPropiedades = departamentos;
	}



	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Departamentos getResideEn() {
		return resideEn;
	}

	public void setResideEn(Departamentos departamentos1) {
		this.resideEn = departamentos1;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
