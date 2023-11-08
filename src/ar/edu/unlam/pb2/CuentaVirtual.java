package ar.edu.unlam.pb2;

public class CuentaVirtual extends Cuenta implements Transferible, MedioDePago {

	private String cvu;

	public CuentaVirtual(String id, String entidadEspado, String titularEsperado) {
		super(id, entidadEspado, titularEsperado);
		// TODO Auto-generated constructor stub
		this.cvu = id;
	}

	public String getCvu() {
		return cvu;
	}

	public void setCvu(String cvu) {
		this.cvu = cvu;
	}

}
