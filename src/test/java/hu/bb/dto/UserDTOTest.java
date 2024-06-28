package hu.bb.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserDTOTest {
    
    @Test
    void testCreateUserDTO() {
        String username = "Test User";

        UserDTO userDTO = new UserDTO();
        
        userDTO.setId("ou=userDTO,cd=todo,cd=hu");
        userDTO.setEmail("testDTO@test.email.com");
        userDTO.setUsername(username);

        assertEquals(username, userDTO.getUsername());
    }
}
