package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Billetera {

	private String nombre;
	private Set<Comercio> comercios;
	private Set<Consumidor> consumidores;

	public Billetera(String string) {
		// TODO Auto-generated constructor stub
		this.nombre = string;
		this.comercios = new HashSet<>();
		this.consumidores = new HashSet<>();
	}

	public Boolean agregarComercio(Comercio comercio) throws CuitInvalidoException {
		// TODO Auto-generated method stub
		if (comercios.add(comercio)) {
			return true;
		}
		throw new CuitInvalidoException();
	}

	public Integer getCantidadDeComercios() {
		// TODO Auto-generated method stub
		return comercios.size();
	}

	public Boolean agregarConsumidor(Consumidor consumidor) throws NoCoincideTitularException {
		// TODO Auto-generated method stub
		if (consumidores.add(consumidor)) {
			return true;
		}
		throw new NoCoincideTitularException();
	}

	public Integer getCantidadDeConsumidores() {
		// TODO Auto-generated method stub
		return consumidores.size();
	}

	public Consumidor buscarConsumidor(Integer dni) {
		Consumidor consumidorBuscado = null;
		for (Consumidor consumidor : consumidores) {
			if (consumidor.getDni().equals(dni)) {
				consumidorBuscado = consumidor;
			}
		}
		return consumidorBuscado;
	}

	public void agregarMedioDePago(Integer dniConsumidor, MedioDePago medioDePago) {
		// TODO Auto-generated method stub
		Consumidor consumidorBuscado = buscarConsumidor(dniConsumidor);
		if (consumidorBuscado != null) {
			consumidorBuscado.setMedios(medioDePago);
		}

	}

	public Integer getCantidadDeMediosDePago(Integer i) {
		// TODO Auto-generated method stub
		return buscarConsumidor(i).getCantidadDeMedios();
	}

	public Boolean pagar(Compra codigoQR, MedioDePago medioPagador) {
		// TODO Auto-generated method stub
		if (((TarjetaDeCredito) medioPagador).getSaldo() >= ((TarjetaDeCredito) medioPagador).getLimiteCompraEnPesos()
				&& ((TarjetaDeCredito) medioPagador).getSaldo() >= ((TarjetaDeCredito) medioPagador)
						.getLimiteCompraEnDolares()) {

		} else if (((TarjetaDeCredito) medioPagador).getSaldo() < ((TarjetaDeCredito) medioPagador)
				.getLimiteCompraEnPesos()
				&& ((TarjetaDeCredito) medioPagador).getSaldo() < ((TarjetaDeCredito) medioPagador)
						.getLimiteCompraEnDolares()) {

		}
		return true;
	}

	public Compra generarCodigoQR(Long l, Double d) {
		// TODO Auto-generated method stub
		return new Compra(l, d);
	}
}
