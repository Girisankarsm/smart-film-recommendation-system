package com.example.filmrecommendation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.filmrecommendation.service.MovieService;

import reactor.core.publisher.Mono;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Endpoint to fetch movie recommendations by genre and page
    @GetMapping("/recommend")
    public Mono<String> getRecommendations(@RequestParam String genre,
                                           @RequestParam(defaultValue = "1") int page) {
        String genreId = genreToId(genre);
        return movieService.getMoviesByGenre(genreId, page);
    }

    // Endpoint to fetch movie details by ID
    @GetMapping("/movie")
    public Mono<String> getMovieDetails(@RequestParam String id) {
        return movieService.getMovieById(id);
    }

    // Optional: redirect endpoint for frontend clickable card navigation
    @GetMapping("/moviePage")
    public String moviePage(@RequestParam String id) {
        // Frontend can navigate to: /details.html?id=<movieId>
        return "redirect:/details.html?id=" + id;
    }

    // Map genre names to TMDb genre IDs
    private String genreToId(String genre) {
        return switch (genre.toLowerCase()) {
            case "action" -> "28";
            case "comedy" -> "35";
            case "drama" -> "18";
            case "horror" -> "27";
            case "romance" -> "10749";
            case "thriller" -> "53";
            case "sci-fi" -> "878";
            case "fantasy" -> "14";
            default -> "35"; // default Comedy
        };
    }
}
