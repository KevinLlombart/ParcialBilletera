package ar.edu.unlam.pb2;

public class CuentaBancaria extends Cuenta implements Transferible, MedioDePago {

	private String cbu;

	public CuentaBancaria(String id, String entidadEspado, String titularEsperado) {
		super(id, entidadEspado, titularEsperado);
		// TODO Auto-generated constructor stub
		this.cbu = id;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

}
