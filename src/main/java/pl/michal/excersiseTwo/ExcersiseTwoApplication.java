package pl.michal.excersiseTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcersiseTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcersiseTwoApplication.class, args);
	}


	//Kolejny restowy CRUD (create, read, update, delete) - czyli aplikacja, która wystawia RESTowe API.
	// Uważam, że w tym obszarze trzeba być dość płynnym i rozumieć co się dzieje. Klepie się to cały czas,
	// pytania rekrutacyjne zwykle rozbijają się w okolicach tego tematu. Temat przewodni: Library.
	// Główną encją niech będzie książka Book. Book ma mieć pola: Long id, String author, String title,
	// Int year, Int numberOfPages. Udostępnijcie
	//w kontrolerze wszystkie metody, żeby książkę się dało dodać, usunąć, edytować, odczytać listę książek,
	// odczytać jedną wg jej ID. Baza danych H2.

}
