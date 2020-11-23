package com.aalhabib01.xyz.BloodDonationBackend.jwt.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
    private final String type = "Bearer";

    private String token;

    private Set<String> roles;
}