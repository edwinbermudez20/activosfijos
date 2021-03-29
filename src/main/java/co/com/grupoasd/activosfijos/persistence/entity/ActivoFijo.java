package co.com.grupoasd.activosfijos.persistence.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name="activos_fijos")
public class ActivoFijo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numero_inventario")
	private Integer numeroInventario;
	@EmbeddedId
	private ActivoFijoPK activoFijoPK;
	private String nombre;
	private String descripcion;
	private String tipo;
	private String serial;
	private double peso;
	private double alto;
	private double ancho;
	private double largo;
	@Column(name="valor_compra")
	private Integer valorCompra; 
	@Column(name="fecha_compra")
	private LocalDateTime fechaCompra;
	@Column(name="fecha_baja")
	private LocalDateTime fechaBaja;
	private String color;
	public Integer getNumeroInventario() {
		return numeroInventario;
	}
	public void setNumeroInventario(Integer numeroInventario) {
		this.numeroInventario = numeroInventario;
	}
	public ActivoFijoPK getActivoFijoPK() {
		return activoFijoPK;
	}
	public void setActivoFijoPK(ActivoFijoPK activoFijoPK) {
		this.activoFijoPK = activoFijoPK;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public Integer getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(Integer valorCompra) {
		this.valorCompra = valorCompra;
	}
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public LocalDateTime getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(LocalDateTime fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ActivoFijo [numeroInventario=");
		builder.append(numeroInventario);
		builder.append(", activoFijoPK=");
		builder.append(activoFijoPK);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", serial=");
		builder.append(serial);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", alto=");
		builder.append(alto);
		builder.append(", ancho=");
		builder.append(ancho);
		builder.append(", largo=");
		builder.append(largo);
		builder.append(", valorCompra=");
		builder.append(valorCompra);
		builder.append(", fechaCompra=");
		builder.append(fechaCompra);
		builder.append(", fechaBaja=");
		builder.append(fechaBaja);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
}
