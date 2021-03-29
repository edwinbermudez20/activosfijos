package co.com.grupoasd.activosfijos.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="personas")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_persona")
	private Integer idPersona;
	@Column(name="numero_cedula")
	private Integer numeroCedula;
	private String nombre1;
	private String nombre2;
	private String apellido1;
	private String apellido2;
	
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public Integer getNumeroCedula() {
		return numeroCedula;
	}
	public void setNumeroCedula(Integer numeroCedula) {
		this.numeroCedula = numeroCedula;
	}
	public String getNombre1() {
		return nombre1;
	}
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	public String getNombre2() {
		return nombre2;
	}
	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [idPersona=");
		builder.append(idPersona);
		builder.append(", numeroCedula=");
		builder.append(numeroCedula);
		builder.append(", nombre1=");
		builder.append(nombre1);
		builder.append(", nombre2=");
		builder.append(nombre2);
		builder.append(", apellido1=");
		builder.append(apellido1);
		builder.append(", apellido2=");
		builder.append(apellido2);
		builder.append("]");
		return builder.toString();
	}
}
