package co.com.grupoasd.activosfijos.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="areas")
public class Area {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_AREA")
	private Integer idArea;
	private String ciudad;
	
	public Integer getIdArea() {
		return idArea;
	}
	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Area [idArea=");
		builder.append(idArea);
		builder.append(", ciudad=");
		builder.append(ciudad);
		builder.append("]");
		return builder.toString();
	}
}
