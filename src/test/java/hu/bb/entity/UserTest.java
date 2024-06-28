package hu.bb.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;

import org.junit.jupiter.api.Test;

import hu.bb.constants.NotificationType;

class UserTest {
    
    @Test
    void testUser() throws InvalidNameException {
    
        User user = new User();

        String username = "Test";
        String pw = "testPW";
        Date date = new Date();

        user.setUsername(username);
        user.setEmail("test@test.mail.com");
        user.setId(new LdapName("ou=user,cd=todo,cd=hu"));
        user.setNotificationType(NotificationType.EMAIL.getType());
        user.setCreatedAt(date);
        user.setUpdatedAt(date);
        user.setPassword(pw);

        assertEquals(date, user.getCreatedAt());
        assertEquals(date, user.getUpdatedAt());
        assertEquals(username, user.getUsername());
        assertEquals(pw, user.getPassword());
    }
}
