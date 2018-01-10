package cinema;

import java.util.HashMap;
import java.util.Map;

public class Service {
	private Map<Integer, Movie> movieMap;
	private static int id = 0;

	public Service() {
		movieMap = new HashMap<Integer, Movie>();
	}

	public void addFilm(Movie filmToAdd) {
		movieMap.put(id++, filmToAdd);
	}

	public void deleteMovie(int movieToDeleteIndex) {
		movieMap.remove(movieToDeleteIndex);
	}
	
	public Movie getMovieAtIndex(int movieToGet) {
		return movieMap.get(movieToGet);
	}
	
	public Map<Integer, Movie> getMap() {
		return movieMap;
	}

}
