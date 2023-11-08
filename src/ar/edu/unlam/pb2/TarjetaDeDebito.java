package ar.edu.unlam.pb2;

public class TarjetaDeDebito extends Tarjeta implements Pagadora, MedioDePago {

	private Double saldo = 0.0;

	public TarjetaDeDebito(Long numero, String tituloEsperado, String fechaDeVencimiento, Integer codigoDeSeguridad) {
		super(numero, tituloEsperado, fechaDeVencimiento, codigoDeSeguridad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setSaldo(Double d) {
		// TODO Auto-generated method stub
		this.saldo = d;

	}

	public Double getSaldo() {
		return saldo;
	}

}
