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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "visitas")
public class Visitas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@DateTimeFormat
	private String hora;
	@DateTimeFormat
	private String fecha;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persona_id")
	private Usuarios persona;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
		@JoinTable(name = "departamentos_visitas", 
		joinColumns = @JoinColumn(name = "departamento_id"), 
		inverseJoinColumns = @JoinColumn(name = "visita_id"))
	private List<Departamentos> departamento;

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	public Visitas() {
	}

	public Visitas(String hora, String fecha, Usuarios usuarios, Empresas empresas, 
			List<Departamentos> departamento) {
		this.hora = hora;
		this.fecha = fecha;
		this.persona = usuarios;
	
		this.departamento = departamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Usuarios getPersona() {
		return persona;
	}

	public void setPersona(Usuarios usuarios) {
		this.persona = usuarios;
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

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Departamentos> getDepartamento() {
		return departamento;
	}

	public void setDepartamento(List<Departamentos> departamento) {
		this.departamento = departamento;
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
