package hu.bb.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import hu.bb.configuration.JwtConfiguration;
import hu.bb.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    private JwtConfiguration jwtConfiguration;

    public JwtUtil(JwtConfiguration jwtConfiguration) {
        this.jwtConfiguration = jwtConfiguration;
    }


    public String generateToken(User user) {
        return Jwts.builder()
            .subject(user.getUsername())
            .claims(generateClaims(user))
            .expiration(new Date(System.currentTimeMillis() + jwtConfiguration.getExpire()))
            .signWith(getSigningKey())
            .compact();
    }


    public String extractUsername(String token) {
        return Jwts.parser()
            .decryptWith(getSigningKey())
            .build()
            .parseUnsecuredClaims(token)
            .getPayload()
            .getSubject();
    }


    private Map<String, String> generateClaims(User user){
        Map<String, String> claims = new HashMap<>();

        claims.put("email", user.getEmail());
        claims.put("id", user.getId().toString());
        claims.put("notificationType", user.getNotificationType());

        return claims;
    }

    private SecretKey getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(jwtConfiguration.getKey());
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
