//Alberto Sanz Carmen 1ºDAM
package contactos;

import java.util.Arrays;

public class Agenda {
	// array de almacenamiento de contactos
	private Contacto[] arraycontacto;
	// atributo estatico de capacidad maxima de contactos de la agenda
	final static int Cap_CONTACTOS = 500;

	// constructor para la capacidad de contactos indicada
	public Agenda(int maxCont) {
		arraycontacto = new Contacto[maxCont];
	}

	// constructor conla limitacion de 500 contactos
	public Agenda() {
		arraycontacto = new Contacto[Cap_CONTACTOS];
	}

	// metodo de busqueda e el que busca a lo largo de todo el array el nombre y
	// apellidos introducido y lo muestra
	// o escribe null si no existe el contacto

	public void buscaContacto(String nombre, String apellidos) {
		boolean buscado = false; // utilizamos esta variable bool para salir del bucle al encontrar una
									// coincidencia
		for (int i = 0; i < arraycontacto.length && !buscado; i++) {
			if (arraycontacto[i] != null && arraycontacto[i].getNombre().equalsIgnoreCase(nombre)
					&& arraycontacto[i].getApellidos().equalsIgnoreCase(apellidos)) {
				// el metodo equalsIgnoreCase nos permite comparar los String sin tener en
				// cuenta mayusculas
				System.out.println(this.arraycontacto[i].toString());
				buscado = true;
			}
		}
		if (!buscado) {
			System.out.println("null");
		}
	}

	// creamos un metodo existecontacto para utilizarlo en el metodo de agregar
	// contacto
	// no he podido hacerlo todo en un metodo sin que de error
	public boolean existeContacto(Contacto c) {
		for (int i = 0; i < arraycontacto.length; i++) {
			if (arraycontacto[i] != null && c.equals(arraycontacto[i])) {
				return true;
			}
		}
		return false;
	}

	// en este metodo primero comprobamos si existe en contacto a añadir con el
	// metodo anterior
	// despues buscamos el primer elemento del array que sea null y añadimos el
	// contacto
	public void agregaContacto(Contacto c) {

		if (existeContacto(c)) {

		} else {
			boolean encontrado = false;
			for (int i = 0; i < arraycontacto.length && !encontrado; i++) {
				if (arraycontacto[i] == null) {
					arraycontacto[i] = c;
					encontrado = true;
				}
			}
		}
	}

	// buscamos todos los elementos que no sean null y los hacemos null
	public void eliminaTodos() {
		for (int i = 0; i < arraycontacto.length; i++) {
			if (arraycontacto[i] != null) {
				arraycontacto[i] = null;
			}
		}
	}

	// para contar los usuarios con un miso dominio creamos un contador
	// comprobamos solo los contactos que no sean null y los que su email no sea
	// null
	// meadiante endsWithh comprobamos cuales terminan el email con nuestro dominio
	public int nroContactosConEMail(String dominio) {

		int contador = 0;
		for (int i = 0; i < arraycontacto.length && arraycontacto[i] != null; i++) {
			if (arraycontacto[i].getEmail() != null && arraycontacto[i].getEmail().endsWith(dominio)) {

				contador++;
			}
		}
		return contador;
	}

	// utilizamos el metodo toString de la clase Arrays de .util
	public String toString() {
		return Arrays.toString(arraycontacto);
	}

}