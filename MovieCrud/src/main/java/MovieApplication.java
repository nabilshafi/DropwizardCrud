import Health.MovieHealthCheck;
import Resources.MovieResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class MovieApplication extends Application<MovieConfiguration>{

    public static void main(final String[] args) throws Exception {
        new MovieApplication().run(args);

    }


    public void run(MovieConfiguration movieConfiguration, Environment environment) throws Exception {

        environment.jersey().register(new MovieResource());
        environment.jersey().register(new MovieHealthCheck());

    }
}
