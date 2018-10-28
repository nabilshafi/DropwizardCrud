import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import Representation.Movie;
import Service.MovieService;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class MovieTest {

    private Movie movie;

    @Before
    public void setUp(){
        movie = new Movie();
    }

    @Test
    public void test_constructor(){
        final long id = 10;
        final String name = "Inception";
        final String year = "2010";

        final Movie movie = new Movie(id,name,year);

        assertEquals( id, movie.getId() );
        assertEquals( name, movie.getName() );
    }

    @Test
    public void givenMovieDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived() throws IOException
    {
    HttpUriRequest request = new HttpGet( "http://localhost:8080/movie/year?year=1990");
    HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
    assertThat(httpResponse.getStatusLine().getStatusCode(),
                    equalTo(HttpStatus.SC_NOT_FOUND));
    }
}
