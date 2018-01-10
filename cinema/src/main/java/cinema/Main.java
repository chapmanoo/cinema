package cinema;

import com.google.gson.*;

public class Main {
	
	public static void main(String args[]) {
		Service service = new Service();
		Gson gson = new Gson();
		Movie movieOne = new Movie("Elf", "Comedy", "PG");
		Movie movieTwo = new Movie("Elf 2", "Comedy", "12");
		Movie movieThree = new Movie("Elf 3", "Horror", "18");
		
		service.addFilm(movieOne);
		service.addFilm(movieTwo);
		service.addFilm(movieThree);
		
		service.getMovieAtIndex(2);
		service.deleteMovie(2);
		
		String jsonInString = gson.toJson(service.getMap());
				
		System.out.println(jsonInString);
		
		
	}


}
