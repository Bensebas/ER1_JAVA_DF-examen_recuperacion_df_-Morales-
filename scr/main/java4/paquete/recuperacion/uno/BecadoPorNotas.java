package paquete.recuperacion.uno;

public class BecadoPorNotas extends Becado {

	protected String codigoColegio = "";
	protected int fechaDeCumplea�os = 0;

	public String getCodigoColegio() {
		return codigoColegio;
	}

	public void setCodigoColegio(String codigoColegio) {
		this.codigoColegio = codigoColegio;
	}

	public int getFechaDeCumplea�os() {
		return fechaDeCumplea�os;
	}

	public void setFechaDeCumplea�os(int fechaDeCumplea�os) {
		this.fechaDeCumplea�os = fechaDeCumplea�os;
	}

	@Override
	public String toString() {
		return "BecadoPorNotas [codigoColegio=" + codigoColegio + ", fechaDeCumplea�os=" + fechaDeCumplea�os
				+ ", codigoDeBeca=" + codigoDeBeca + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
