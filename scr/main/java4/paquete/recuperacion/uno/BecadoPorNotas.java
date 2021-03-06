package paquete.recuperacion.uno;

public class BecadoPorNotas extends Becado {

	protected String codigoColegio = "";
	protected int fechaDeCumpleaņos = 0;

	public String getCodigoColegio() {
		return codigoColegio;
	}

	public void setCodigoColegio(String codigoColegio) {
		this.codigoColegio = codigoColegio;
	}

	public int getFechaDeCumpleaņos() {
		return fechaDeCumpleaņos;
	}

	public void setFechaDeCumpleaņos(int fechaDeCumpleaņos) {
		this.fechaDeCumpleaņos = fechaDeCumpleaņos;
	}

	@Override
	public String toString() {
		return "BecadoPorNotas [codigoColegio=" + codigoColegio + ", fechaDeCumpleaņos=" + fechaDeCumpleaņos
				+ ", codigoDeBeca=" + codigoDeBeca + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
