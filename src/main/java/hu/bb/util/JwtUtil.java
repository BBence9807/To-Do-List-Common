package hu.bb.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import hu.bb.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    private static final SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private static final long EXPIRATION_TIME = 86400000;

  
    public String generateToken(User user) {
        return Jwts.builder()
                .setClaims(generateClaims(user))
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key)
                .compact();
    }


    public String extractUsername(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody().get("username").toString();
    }


    private Map<String, String> generateClaims(User user){
        Map<String, String> claims = new HashMap<>();

        claims.put("username", user.getUsername());
        claims.put("email", user.getEmail());
        claims.put("id", user.getId().toString());
        claims.put("notificationType", user.getNotificationType());

        return claims;
    }
}
