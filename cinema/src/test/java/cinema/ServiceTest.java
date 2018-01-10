package cinema;

import static org.junit.Assert.*;
import org.junit.Test;

public class ServiceTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenreCount() {
		Service map = new Service();

		Movie movieOne = new Movie("Elf", "Comedy", "PG");
		Movie movieTwo = new Movie("Elf 2", "Comedy", "12");
		Movie movieThree = new Movie("Elf 3", "Horror", "18");
		map.addFilm(movieOne);
		map.addFilm(movieTwo);
		map.addFilm(movieThree);

		int genreCount = map.getGenreCount("Horror");
		assertEquals("Result not expected", genreCount, 1);

		genreCount = map.getGenreCount("Comedy");
		assertEquals("Result not expected", genreCount, 2);

	}
}
