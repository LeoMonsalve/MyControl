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
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "departamento")
public class Departamentos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 1, max = 10)
	private String numero;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "propietario_id")
	private Personas propietario;
	
	@OneToMany(mappedBy = "resideEn", fetch = FetchType.LAZY)
	private List<Personas> personas;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "edificios_id")
	private Edificios edificios;
	@OneToMany(mappedBy="departamento", fetch = FetchType.LAZY)
	private List<Encomienda> encomiendas;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "departamentos_visitas", 
		joinColumns = @JoinColumn(name = "departamento_id"),
		inverseJoinColumns = @JoinColumn(name = "visita_id"))
	private List<Visitas> visitas;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	public Departamentos() {
	}

	
	public Departamentos( String numero, Personas propietario, List<Personas> personas,
			Edificios edificios, List<Visitas> visitas) {
		this.numero = numero;
		this.propietario = propietario;
		this.personas = personas;
		this.edificios = edificios;
		this.visitas = visitas;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Personas getPropietario() {
		return propietario;
	}

	public void setPropietario(Personas personas) {
		this.propietario = personas;
	}

	public List<Personas> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Personas> personas1) {
		this.personas = personas1;
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

	public Edificios getEdificios() {
		return edificios;
	}

	public void setEdificios(Edificios edificios) {
		this.edificios = edificios;
	}

	public List<Visitas> getVisitas() {
		return visitas;
	}

	public void setVisitas(List<Visitas> visitas) {
		this.visitas = visitas;
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
