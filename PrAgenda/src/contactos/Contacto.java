//Alberto Sanz Carmen 1ºDAM
package contactos;
	//atributos String de la clase contacto
public class Contacto {
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;
	
	//constructor de la clase Contacto
	public Contacto (String nombre, String apellidos, String correo, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = correo;
		this.telefono = telefono;
	}
	//getters y setters generados automaticamente
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String correo) {
		this.email = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	//en el metodo toString() utilizamos toUpperCase en los Strings que necesitamos en mayusculas
	//y toLowerCase para los que necesitamos en minuscula ademas de tener cuidado con los espacios para respetar el formato.
	public String toString() {
		return apellidos.toUpperCase() + ", " + nombre.toUpperCase() + " <" +email.toLowerCase()+ "> (" +telefono+ ")";
	}
	//copiamos el codigo que nos dan en la tarea para la comparacion de contactos ya que aun no sabemos crearlo
	public boolean equals(Object o) {
		boolean res = o instanceof Contacto;
		Contacto c = res ? (Contacto) o : null;
		return res && nombre.equalsIgnoreCase(c.nombre)
		&& apellidos.equalsIgnoreCase(c.apellidos);
		}
	
	public int hashCode() {
		return nombre.toUpperCase().hashCode() + 
		apellidos.toUpperCase().hashCode();
		}
}