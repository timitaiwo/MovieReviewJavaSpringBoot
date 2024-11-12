## Description
A Java SpringBoot REST API to track metadata on released movies and customer sentiment (i.e. reviews).
It utilzed MongoDB Atlas (for the database) and used the Bruno REST API client for testing.

[movies.json](/dbResources/movies.json) holds the test data to be stored on the mongodb instance.

## Endpoints
- /api/v1/reviews: To add a movie review. The body must be a json object with "imbdId" as the key for the movie and "reviewBody" as the key for the movie review
    {
    "reviewBody" : "I really enjoyed the movie and would like to watch it again",
    "imdbId" : "tt3915174"
  }

- /api/v1/movies/{imdbID}: Endpoint to request infomation on a movie and its reviews. e.g. /api/v1/movies/tt3447590

- /api/v1/movies: Endpoint to request infomation on all movies and their reviews


## Things to note:

Project defaults to localhost:8080 or 127.0.0.1:8080

Remember to check if .env file in src/main/resources/ is populated

In Linux/Unix shell use. Use the equivalent for Windows

```chmod +x mvnw```

then

```./mvnw sprint-boot:run```
