package co.com.grupoasd.activosfijos.persistence.entity;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class ActivoFijoPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="id_estado_actual")
	private Integer idEstadoActual;
	@Column(name="id_persona")
	private Integer idPersona;
	@Column(name="id_area")
	private Integer idArea;
	public Integer getIdEstadoActual() {
		return idEstadoActual;
	}
	public void setIdEstadoActual(Integer idEstadoActual) {
		this.idEstadoActual = idEstadoActual;
	}
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public Integer getIdArea() {
		return idArea;
	}
	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ActivoFijoPK [idEstadoActual=");
		builder.append(idEstadoActual);
		builder.append(", idPersona=");
		builder.append(idPersona);
		builder.append(", idArea=");
		builder.append(idArea);
		builder.append("]");
		return builder.toString();
	}
}
