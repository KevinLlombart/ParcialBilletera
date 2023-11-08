package ar.edu.unlam.pb2;

public class Compra {

	private Long cuit;
	private Double monto;

	public Compra(Long i, Double d) {
		// TODO Auto-generated constructor stub
		this.cuit = i;
		this.monto = d;
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

}
