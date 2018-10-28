package Resources;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import Representation.Movie;
import Service.MovieService;
import com.codahale.metrics.annotation.Timed;
import org.eclipse.jetty.http.HttpStatus;


@Path("/movie")
@Produces(MediaType.APPLICATION_JSON)
public class MovieResource {

    MovieService movieService = new MovieService();

    @GET
    @Timed
    public String getMovie(@QueryParam("name") String name) {
        //final String value = String.format(template, name.orElse(defaultName));
        String year =  movieService.getMovie(name);
        if(year == null){
            return null;
        }
        else
            return year;
    }

    @POST
    @Timed
    public String saveMovie(@QueryParam("name") String name, @QueryParam("year") String year) {
        //final String value = String.format(template, name.orElse(defaultName));
        return movieService.addMovie(name,year);
    }

}
