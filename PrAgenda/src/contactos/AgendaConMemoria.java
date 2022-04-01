//Alberto Sanz Carmen 1ºDAM
package contactos;

public class AgendaConMemoria extends Agenda {

	private String ultimo_nombre;
	private String ultimo_apellido;

	public AgendaConMemoria(String nombre, String apellido) {
		super.buscaContacto(nombre, apellido);
		ultimo_nombre = nombre;
		ultimo_apellido = apellido;
	}

	public String ultimoContacto() {
		return (ultimo_nombre + ultimo_apellido);
		// soy completamente consciente de que no esta bien porque no se trata de un
		// objeto contacto sino de un metodo con dos string pero no he sido capaz de hacerlo a tiempo
		// he intentado mil formas y siempre tengo algun fallo de compatibilidad de variables
		// a ver si puedes explicar como se hace esto
	}

}