package ru.dnlkk.ratingusbackend.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JWTRequest {
    private String login;
    private String password;
}
