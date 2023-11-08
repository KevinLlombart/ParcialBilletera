package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Consumidor {

	private String nombre;
	private Integer dni;
	private Set<MedioDePago> medios;

	public Consumidor(Integer dNI_ESPERADO, String nOMBRE_ESPERADO) {
		// TODO Auto-generated constructor stub
		this.nombre = nOMBRE_ESPERADO;
		this.dni = dNI_ESPERADO;
		this.medios = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getDni() {
		return dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Consumidor other = (Consumidor) obj;
		return Objects.equals(dni, other.dni);
	}

	public Set<MedioDePago> getMedios() {
		return medios;
	}

	public void setMedios(MedioDePago medios) {
		this.medios.add(medios);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	public Integer getCantidadDeMedios() {
		// TODO Auto-generated method stub
		return medios.size();
	}

	public MedioDePago getMedioPagador(Long l) throws MedioDePagoInvalidoException {
		// TODO Auto-generated method stub
		for (MedioDePago medioDePago : medios) {
			if(((Tarjeta)medioDePago).getNumero().equals(l)) {
				return medioDePago;
			}
		}
		throw new MedioDePagoInvalidoException();
	}
	
	

}
