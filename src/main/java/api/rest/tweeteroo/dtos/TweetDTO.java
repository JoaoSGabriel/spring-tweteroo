package api.rest.tweeteroo.dtos;

public record TweetDTO(
    String username,
    String tweet,
    String avatar
) {}