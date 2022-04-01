
package contactos;

public class Agenda_main {
	public static void main(String[] args) {
// Creamos un array con contactos
		Contacto[] contactos = { new Contacto("Pepe", "Montes", "jmontes@gmail.com", "111222333"),
				new Contacto("Jose", "Llanos", "jllanos@hotmail.com", "666777888"),
				new Contacto("Fefi", "R�os", "mjrios@gmail.com", "333444555"),
				new Contacto("Pepi", "Colinas", "jcolinas@uma.es", "222333444") };
// Creamos un contacto
		Contacto contacto = new Contacto("Pepito", "Arroyo", "ja@gmail.com", "444555666");
// A�adimos a una agenda los cuatro contactos del array anterior
		Agenda agenda = new Agenda(100);
		for (Contacto c : contactos)
			agenda.agregaContacto(c);
// Agregamos contacto ya existente (aunque con diferente email).
// No deber�a a�adirse
		agenda.agregaContacto(new Contacto("Pepe", "Montes", "pepe.montes@hotmail.com", "111222333"));
// Agregamos un contacto que no est� en la agenda. Deber�a a�adirse
		agenda.agregaContacto(contacto);
// Visualizamos la agenda. Deber�a incluir cinco contactos
		System.out.println("La agenda debe incluir cinco contactos: \n\t" + agenda);
// Imprimimos el n�mero de contactos con correo electr�nico en gmail.com: 3
		System.out.println(
				"El n�mero de contactos con direcci�n en gmail.com es: " + agenda.nroContactosConEMail("gmail.com"));
// Eliminamos la agenda
		agenda.eliminaTodos();
// Visualizamos la agenda, que deber�a estar vac�a
		System.out.println("La agenda debe estar vac�a: \n\t" + agenda);
	}
}