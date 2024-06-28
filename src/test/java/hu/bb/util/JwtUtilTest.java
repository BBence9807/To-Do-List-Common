package hu.bb.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hu.bb.constants.NotificationType;
import hu.bb.entity.User;

class JwtUtilTest {
    
    JwtUtil jwtUtil;

    @BeforeEach
    void init(){
        jwtUtil = new JwtUtil();
        
    }

    @AfterEach
    void tearDown(){
        jwtUtil = null;
    }


    @Test
    void tokenGenerationTest() throws InvalidNameException{
        User user = User.builder()
            .id(new LdapName("ou=Test"))
            .email("test.user@t.com")
            .notificationType(NotificationType.EMAIL.getType())
            .password("Test")
            .username("TestUser")
            .createdAt(new Date())
            .updatedAt(new Date())
            .build();

        String token = jwtUtil.generateToken(user);
        
        assertNotNull(token);
        assertEquals(user.getUsername(), jwtUtil.extractUsername(token));
    }
}
