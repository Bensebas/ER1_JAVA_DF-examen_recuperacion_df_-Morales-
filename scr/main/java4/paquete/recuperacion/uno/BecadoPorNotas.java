package paquete.recuperacion.uno;

public class BecadoPorNotas extends Becado {

	protected String codigoColegio = "";
	protected int fechaDeCumpleaños = 0;

	public String getCodigoColegio() {
		return codigoColegio;
	}

	public void setCodigoColegio(String codigoColegio) {
		this.codigoColegio = codigoColegio;
	}

	public int getFechaDeCumpleaños() {
		return fechaDeCumpleaños;
	}

	public void setFechaDeCumpleaños(int fechaDeCumpleaños) {
		this.fechaDeCumpleaños = fechaDeCumpleaños;
	}

	@Override
	public String toString() {
		return "BecadoPorNotas [codigoColegio=" + codigoColegio + ", fechaDeCumpleaños=" + fechaDeCumpleaños
				+ ", codigoDeBeca=" + codigoDeBeca + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
