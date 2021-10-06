package paquete.recuperacion.uno;

public class BecadoPorRecursos extends Becado {

	protected String codigoBeneficio = "";
	protected int salarioDePadres = 0;

	public String getCodigoBeneficio() {
		return codigoBeneficio;
	}

	public void setCodigoBeneficio(String codigoBeneficio) {
		this.codigoBeneficio = codigoBeneficio;
	}

	public int getSalarioDePadres() {
		return salarioDePadres;
	}

	public void setSalarioDePadres(int salarioDePadres) {
		this.salarioDePadres = salarioDePadres;
	}

	@Override
	public String toString() {
		return "BecadoPorRecursos [codigoBeneficio=" + codigoBeneficio + ", salarioDePadres=" + salarioDePadres
				+ ", codigoDeBeca=" + codigoDeBeca + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
