package Service;


import Representation.Movie;

import java.util.ArrayList;
import java.util.Date;

public class MovieService {

    ArrayList<Movie> mv = new ArrayList();

    public String addMovie(String name, String year){

        mv.add(new Movie(name,year));
        return "movie added";
    }

    public String getMovie(String name){

        for(Movie movie : mv){
            if(movie.getName().equals(name)){
                return movie.getYear();
            }
        }
        return null;
    }
}

