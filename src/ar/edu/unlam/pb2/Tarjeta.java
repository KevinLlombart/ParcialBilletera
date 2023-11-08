package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class Tarjeta {

	private Long numero;
	private String titular;
	private Integer codigoDeSeguridad;
	private String fechaDeVencimiento;

	public Tarjeta(Long numero, String tituloEsperado, String fechaDeVencimiento, Integer codigoDeSeguridad) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
		this.titular = tituloEsperado;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titulo) {
		this.titular = titulo;
	}

	public Integer getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}

	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(numero, other.numero);
	}

}
