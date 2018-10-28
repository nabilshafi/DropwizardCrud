package Service;


import Representation.Movie;

import java.util.ArrayList;

public class MovieService {

    ArrayList<Movie> mv = new ArrayList();
    private long counter = 0;

    public String addMovie(String name, String year){

        for(Movie movie : mv){
            if(movie.getName().equals(name)){
                if(movie.getYear().equals(year))
                    return "Movie already presents";
            }
        }
        mv.add(new Movie(counter++,name,year));
        return "movie added";
    }

    public Movie getMovie(String name){

        for(Movie movie : mv){
            if(movie.getName().equals(name)){
                return movie;
            }
        }
        return null;
    }
    public ArrayList<Movie> getMovieByYear(String year){

        ArrayList<Movie> mvList = new ArrayList();
        for(Movie movie : mv){
            if(movie.getYear().equals(year)){
                mvList.add(movie);

            }
        }
        return mvList;
    }

    public ArrayList<Movie> getAllMovie(){

      if(!mv.isEmpty())
          return mv;
        return null;
    }

    public String deleteMovie(String name, String year){

        for(Movie movie : mv){
            if(movie.getName().equals(name)){
                if(movie.getYear().equals(year)){
                    mv.remove(movie);
                    return "Movie Removed";
                }

            }
        }

        return "Movie not found";
    }

    public String updateMovie(String name, String year, String actor){

        for(Movie movie : mv){
            if(movie.getName().equals(name)){
                mv.add(new Movie(name,year,actor));
                mv.remove(movie);
                return "movie updated succesfully";
            }
        }

        return "Movie not found";

    }
}

