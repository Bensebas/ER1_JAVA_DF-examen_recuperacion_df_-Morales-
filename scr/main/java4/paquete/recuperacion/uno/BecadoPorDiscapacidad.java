package paquete.recuperacion.uno;

public class BecadoPorDiscapacidad extends Becado {

	protected String codigoConadis = "";
	protected String discapacidad = "";

	public String getCodigoConadis() {
		return codigoConadis;
	}

	public void setCodigoConadis(String codigoConadis) {
		this.codigoConadis = codigoConadis;
	}

	public String getDiscapacidad() {
		return discapacidad;
	}

	public void setDiscapacidad(String discapacidad) {
		this.discapacidad = discapacidad;
	}

	@Override
	public String toString() {
		return "BecadoPorDiscapacidad [codigoConadis=" + codigoConadis + ", discapacidad=" + discapacidad
				+ ", codigoDeBeca=" + codigoDeBeca + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
