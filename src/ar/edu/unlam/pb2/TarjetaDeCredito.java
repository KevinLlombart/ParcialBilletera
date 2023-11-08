package ar.edu.unlam.pb2;

public class TarjetaDeCredito extends Tarjeta implements Pagadora, MedioDePago {

	private Double limiteCompraEnPesos;
	private Double limiteCompraEnDolares;
	private Double saldo = 0.0;

	public TarjetaDeCredito(Long numero, String tituloEsperado, String fechaDeVencimiento, Integer codigoDeSeguridad,
			Double limiteCompraEnPesos, Double limiteCompraEnDolares) {
		super(numero, tituloEsperado, fechaDeVencimiento, codigoDeSeguridad);
		this.limiteCompraEnPesos = limiteCompraEnPesos;
		this.limiteCompraEnDolares = limiteCompraEnDolares;
	}

	public Double getLimiteCompraEnPesos() {
		return limiteCompraEnPesos;
	}

	public void setLimiteCompraEnPesos(Double limiteCompraEnPesos) {
		this.limiteCompraEnPesos = limiteCompraEnPesos;
	}

	public Double getLimiteCompraEnDolares() {
		return limiteCompraEnDolares;
	}

	public void setLimiteCompraEnDolares(Double limiteCompraEnDolares) {
		this.limiteCompraEnDolares = limiteCompraEnDolares;
	}

	public Double getSaldo() {
		return saldo;
	}

	@Override
	public void setSaldo(Double d) {
		// TODO Auto-generated method stub
		this.saldo = d;
	}

}
