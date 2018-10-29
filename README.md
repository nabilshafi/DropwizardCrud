# DropwizardCrud

Its a Movie library CRUD using Java and Dropwizard.

# Instructions:

-git clone https://github.com/nabilshafi/DropwizardCrud.git

-Go to MovieCrud directory

-In command prompt type

-mvn package 

-java -jar target/MovieCrud-1.0-SNAPSHOT.jar server


# Features:
Add movie with its name and year.
Fetch movie with year and name.
Update movie name, year and actor.
Delete the movie


# Endpoints

GET
http://localhost:8080/movie/year?year='year'
http://localhost:8080/movie/name?name='name'
http://localhost:8080/movie

POST
http://localhost:8080/movie?name='name'&year='year'

PUT
http://localhost:8080/movie?name='name'&year='year'&actor='actor'

DELETE
http://localhost:8080/movie?name='name'&year='year'

# Running Examples:

POST
http://localhost:8080/movie?name=inception&year=1990

PUT
http://localhost:8080/movie?name=inception&year=1990&actor=Leo

GET
http://localhost:8080/movie/year?year=1990
http://localhost:8080/movie/name?name=inception
http://localhost:8080/movie

DELETE
http://localhost:8080/movie?name=asli&year=1990
