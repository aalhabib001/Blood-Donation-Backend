package com.aalhabib01.xyz.BloodDonationBackend.jwt.security.uti;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

/**
 * JWT utils
 */
public class JwtUtil {

    /**
     * Return URL safe compact JWT string.
     *
     * @param claims
     * @return
     */
    public String getJwts(Claims claims) {
        return Jwts.builder().setClaims(claims)
                /*.setIssuer(tokenIssuer)
                .setIssuedAt(issueDate)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.RS256, privateKey)*/
                .compact();
    }

}
