package com.example.filmrecommendation.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class MovieService {

    @Value("${tmdb.api.key}")
    private String apiKey;

    private final String BASE_URL = "https://api.themoviedb.org/3";
    private final WebClient webClient = WebClient.create(BASE_URL);

    public Mono<String> getMoviesByGenre(String genreId, int page) {
        String url = "/discover/movie?api_key=" + apiKey + "&with_genres=" + genreId + "&language=en-US&page=" + page;
        return webClient.get()
                .uri(url)
                .retrieve()
                .onStatus(status -> status.isError(), clientResponse ->
                        Mono.error(new RuntimeException("Failed to fetch movies by genre")))
                .bodyToMono(String.class)
                .doOnError(err -> System.out.println("Error fetching movies: " + err.getMessage()));
    }

    public Mono<String> getMovieById(String movieId) {
        String url = "/movie/" + movieId + "?api_key=" + apiKey + "&language=en-US";
        return webClient.get()
                .uri(url)
                .retrieve()
                .onStatus(status -> status.isError(), clientResponse ->
                        Mono.error(new RuntimeException("Failed to fetch movie details")))
                .bodyToMono(String.class)
                .doOnError(err -> System.out.println("Error fetching movie details: " + err.getMessage()));
    }
}
