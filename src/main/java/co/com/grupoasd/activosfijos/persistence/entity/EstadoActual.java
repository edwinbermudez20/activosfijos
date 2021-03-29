package co.com.grupoasd.activosfijos.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="estados_actuales")
public class EstadoActual {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estado_actual")
	private Integer idEstadoActual;
	private boolean activo;
	@Column(name = "dado_baja")
	private boolean dadoBaja;
	private boolean reparacion;
	private boolean disponible;
	private boolean asignado;
	public Integer getIdEstadoActual() {
		return idEstadoActual;
	}
	public void setIdEstadoActual(Integer idEstadoActual) {
		this.idEstadoActual = idEstadoActual;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public boolean isDadoBaja() {
		return dadoBaja;
	}
	public void setDadoBaja(boolean dadoBaja) {
		this.dadoBaja = dadoBaja;
	}
	public boolean isReparacion() {
		return reparacion;
	}
	public void setReparacion(boolean reparacion) {
		this.reparacion = reparacion;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public boolean isAsignado() {
		return asignado;
	}
	public void setAsignado(boolean asignado) {
		this.asignado = asignado;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EstadoActual [idEstadoActual=");
		builder.append(idEstadoActual);
		builder.append(", activo=");
		builder.append(activo);
		builder.append(", dadoBaja=");
		builder.append(dadoBaja);
		builder.append(", reparacion=");
		builder.append(reparacion);
		builder.append(", disponible=");
		builder.append(disponible);
		builder.append(", asignado=");
		builder.append(asignado);
		builder.append("]");
		return builder.toString();
	}
}
