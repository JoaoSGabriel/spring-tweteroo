package api.rest.tweeteroo.dtos;

public record NewTweetDTO(
    String username,
    String tweet
) {}