package Resources;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import Representation.Movie;
import Service.MovieService;
import com.codahale.metrics.annotation.Timed;
import org.eclipse.jetty.http.HttpStatus;

import java.util.ArrayList;


@Path("/movie")
@Produces(MediaType.APPLICATION_JSON)
public class MovieResource {

    MovieService movieService = new MovieService();

    @GET
    @Path("/name")
    @Timed
    public Response getMovie(@QueryParam("name") String name) {
        //final String value = String.format(template, name.orElse(defaultName));
        Movie movie =  movieService.getMovie(name);
        if(movie == null){
            return Response
                    .status(Response.Status.NOT_FOUND).entity("Movie not found").type(MediaType.TEXT_PLAIN).build();
        }
        else
           return Response
                .status(Response.Status.OK)
                .entity(movie)
                .build();
    }

    @GET
    @Path("/year")
    @Timed
    public Response getMovieByYear(@QueryParam("year") String year) {
        //final String value = String.format(template, name.orElse(defaultName));
        ArrayList<Movie> movie =  movieService.getMovieByYear(year);
        if(movie.isEmpty()){
            return Response
                    .status(Response.Status.NOT_FOUND).entity("Movie not found").type(MediaType.TEXT_PLAIN).build();
        }
        else
            return Response
                    .status(Response.Status.OK)
                    .entity(movie)
                    .build();
    }
    @GET
    @Timed
    public ArrayList<Movie> getAllMovie() {
        //final String value = String.format(template, name.orElse(defaultName));
        return movieService.getAllMovie();
    }

    @POST
    @Timed
    public Response saveMovie(@QueryParam("name") String name, @QueryParam("year") String year) {
        //final String value = String.format(template, name.orElse(defaultName));
        String message = movieService.addMovie(name,year);

        return Response
                .status(Response.Status.OK)
                .entity(message)
                .build();

    }

    @DELETE
    @Timed
    public Response deleteMovie(@QueryParam("name") String name, @QueryParam("year") String year) {
        //final String value = String.format(template, name.orElse(defaultName));
        String message = movieService.deleteMovie(name,year);

        return Response
                .status(Response.Status.OK).type(MediaType.TEXT_PLAIN)
                .entity(message)
                .build();

    }

    @PUT
    @Timed
    public Response updateMovie(@QueryParam("name") String name, @QueryParam("year") String year,@QueryParam("actor") String actor) {
        //final String value = String.format(template, name.orElse(defaultName));
        String message = movieService.updateMovie(name,year,actor);

        return Response
                .status(Response.Status.OK).type(MediaType.TEXT_PLAIN)
                .entity(message)
                .build();

    }

}
