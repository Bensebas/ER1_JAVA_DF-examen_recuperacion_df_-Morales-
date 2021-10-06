package paquete.recuperacion.uno;

import java.util.Scanner;

public class MainUno {

	public static void main(String[] args) {
		String us = "";
		int token = 0;
		int num = 0;
		int indice = 0;
		String var = "no";
		String clave = "";
		String car = "";
		String codigoDeBecaA = "";
		String nombreA = "";
		String apellidoA = "";
		String codigoColegioT = "";
		int cumpleañosT = 0;
		String codigoDeBecaB = "";
		String nombreB = "";
		String apellidoB = "";
		String codigoConadisT = "";
		String discapacidadT = "";

		String codigoDeBecaC = "";
		String nombreC = "";
		String apellidoC = "";
		String codigoBeneficioT = "";
		int salarioDeLosPadresT = 0;

		BecadoPorNotas becadoN = new BecadoPorNotas();
		BecadoPorRecursos becadoR = new BecadoPorRecursos();
		BecadoPorDiscapacidad becadoB = new BecadoPorDiscapacidad();
		Becado bec[] = new Becado[10];

		Scanner Lector = new Scanner(System.in);
		Scanner LectorN = new Scanner(System.in);

		do {
			System.out.println("Ingrese usuario del Sistema");
			us = Lector.nextLine();
			if (us.equals("ADMIN")) {
				do {

					System.out.println("Ingrese clave del sistema");
					clave = Lector.nextLine();
					if (us.equals("ABC")) {
						do {
							System.out.println("Sistema SENESCYT");
							System.out.println("1.Ingresar becado");
							System.out.println("2.Búsqueda por tipo de becado");
							System.out.println("3.Búsqueda general");
							System.out.println("4.SALIR");
							num = LectorN.nextInt();
							switch (num) {
							case 1:
								System.out.println("Que tipo de becado desea ingresar?");
								System.out.println("a)Becado por Notas");
								System.out.println("b)Becado por Discapacidad");
								System.out.println("c)Becado por Recursos");
								if (car.equals("a")) {
									do {
										System.out.println("Ingrese el nombre");
										nombreA = Lector.next();
										System.out.println("Ingrese el apellido");
										apellidoA = Lector.next();
										System.out.println("Ingrese la codigo de beca");
										codigoDeBecaA = LectorN.nextLine();
										System.out.println("Ingrese el codigo de seguro");
										codigoColegioT = Lector.next();
										System.out.println("Ingrese codigo de beneficio");
										cumpleañosT = LectorN.nextInt();

										becadoN.setNombre(nombreA);
										becadoN.setApellido(apellidoA);
										becadoN.setCodigoDeBeca(codigoDeBecaA);
										becadoN.setCodigoColegio(codigoColegioT);
										becadoN.setFechaDeCumpleaños(cumpleañosT);

										bec[indice] = becadoN;
										indice++;
										System.out.println("¿Deseas ingresar otro Paciente 3era edad? (yes/no): ");
										var = LectorN.next();
									} while (var.compareTo("yes") == 0);

								} else if (car.equals("b")) {
									do {
										System.out.println("Ingrese el nombre");
										nombreB = Lector.next();
										System.out.println("Ingrese el apellido");
										apellidoB = Lector.next();
										System.out.println("Ingrese codigo de beca");
										codigoDeBecaB = LectorN.nextLine();
										System.out.println("Ingrese el codigo de conadis");
										codigoConadisT = Lector.next();
										System.out.println("Ingrese discapacidad");
										discapacidadT = Lector.nextLine();

										becadoB.setNombre(nombreB);
										becadoB.setApellido(apellidoB);
										becadoB.setCodigoDeBeca(codigoDeBecaB);
										becadoB.setCodigoConadis(codigoConadisT);
										becadoB.setDiscapacidad(discapacidadT);

										bec[indice] = becadoB;
										indice++;
										System.out.println("¿Deseas ingresar otro Paciente 3era edad? (yes/no): ");
										var = LectorN.next();
									} while (var.compareTo("yes") == 0);

								} else if (car.equals("c")) {
									do {
										System.out.println("Ingrese el nombre");
										nombreC = Lector.next();
										System.out.println("Ingrese el apellido");
										apellidoC = Lector.next();
										System.out.println("Ingrese la codigo de beca");
										codigoDeBecaC = LectorN.nextLine();
										System.out.println("Ingrese el codigo beneficio");
										codigoBeneficioT = Lector.next();
										System.out.println("Ingrese salario de los padres ");
										salarioDeLosPadresT = LectorN.nextInt();

										becadoR.setNombre(nombreC);
										becadoR.setApellido(apellidoC);
										becadoR.setCodigoDeBeca(codigoDeBecaC);
										becadoR.setCodigoBeneficio(codigoBeneficioT);
										becadoR.setSalarioDePadres(salarioDeLosPadresT);

										bec[indice] = becadoR;
										indice++;
										System.out.println("¿Deseas ingresar otro Paciente 3era edad? (yes/no): ");
										var = LectorN.next();
									} while (var.compareTo("yes") == 0);

								}

								;
								break;
							case 2:
								System.out.println("Que tipo de becado desea buscar?");
								System.out.println("a)Becado por Notas");
								System.out.println("b)Becado por Discapacidad");
								System.out.println("c)Becado por Recursos");
								
								if (car.equals("a")) {
									
								}else if(car.equals("b")) {
									
								}else if(car.equals("c")) {

								;
								break;}

							case 3:

								;
								break;

							}

						} while (num != 4);

					} else {
						System.out.println("Clave equivocada ingrese clave del sistema");
					}
				} while (token == 0);

			} else {
				System.out.println("usuario incorrecto, por favor ingrese de nuevo");
			}

		} while (token == 0);

	}

}
