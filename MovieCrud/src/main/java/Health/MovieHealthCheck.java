package Health;

import Resources.MovieResource;
import com.codahale.metrics.health.HealthCheck;
import Service.MovieService;

import javax.xml.transform.Result;

public class MovieHealthCheck extends HealthCheck
{
    MovieService movieService;

    public MovieHealthCheck() {

    }

    protected Result check() throws Exception {

        if(movieService.getAllMovie().isEmpty())
            return Result.healthy();
        return Result.unhealthy("");

    }
}

