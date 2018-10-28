import Resources.MovieResource;
import Service.MovieService;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class MovieApplication extends Application<MovieConfiguration>{

    public static void main(final String[] args) throws Exception {
        new MovieApplication().run(args);

    }


    public void run(MovieConfiguration movieConfiguration, Environment environment) throws Exception {

        environment.jersey().register(new MovieResource());

    }
}
