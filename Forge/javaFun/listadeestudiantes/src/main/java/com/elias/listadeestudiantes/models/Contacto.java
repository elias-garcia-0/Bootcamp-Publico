package com.elias.listadeestudiantes.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="contact")
public class Contacto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotBlank(message="Por favor agrega un estado de pais")
	private String state;
	
	@NotBlank(message="Por favor agrega una ciudad")
	private String city;
	@NotBlank(message="Por favor agrega una dirección")
	private String address;
	
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "estudiante_id")
	private Estudiante estudianteModel;
	

	//CONSTRUCTOR
	public Contacto() {
		
	}
	
	//GETTERS Y SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Estudiante getEstudianteModel() {
		return estudianteModel;
	}

	public void setEstudianteModel(Estudiante estudianteModel) {
		this.estudianteModel = estudianteModel;
	}
	
	


}