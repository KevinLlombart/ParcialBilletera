package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class Cuenta {

	private String id;
	private String entidadEspado;
	private String titularEsperado;

	public Cuenta(String id, String entidadEspado, String titularEsperado) {
		super();
		this.id = id;
		this.entidadEspado = entidadEspado;
		this.titularEsperado = titularEsperado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEntidadEspado() {
		return entidadEspado;
	}

	public void setEntidadEspado(String entidadEspado) {
		this.entidadEspado = entidadEspado;
	}

	public String getTitularEsperado() {
		return titularEsperado;
	}

	public void setTitularEsperado(String titularEsperado) {
		this.titularEsperado = titularEsperado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(id, other.id);
	}

}
