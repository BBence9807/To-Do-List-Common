package hu.bb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hu.bb.dto.UserDTO;
import hu.bb.entity.User;
import hu.bb.mapper.UserMapperImpl;

class UserMapperImplTest {

    UserMapperImpl userMapperImpl;
    UserDTO  userDTO;
    User user;

    @BeforeEach
    public void init() throws InvalidNameException{
        userMapperImpl = new UserMapperImpl();
        user = this.createUser();
        userDTO = this.createUserDTO();
    }

    @AfterEach
    public void tearDown(){
        userMapperImpl = null;
    }


    private User createUser() throws InvalidNameException{
        return User.builder()
                    .username("Test")
                    .email("test@test.mail.com")
                    .password("TestPW")
                    .id(new LdapName("ou=user,cd=todo,cd=hu"))
                    .notificationType("email")
                    .createdAt(new Date())
                    .updatedAt(new Date())
                    .build();
    }

    private UserDTO createUserDTO(){
        return UserDTO.builder()
                .id("ou=userDTO,cd=todo,cd=hu")
                .email("testDTO@test.email.com")
                .username("TestDTO")
                .build();
    }

    @Test
    void toUserTest(){
        User createdUser = userMapperImpl.toUser(userDTO);

        assertEquals(createdUser.getUsername(), userDTO.getUsername());
    }

    @Test
    void toUserDTOTest(){
        UserDTO createdUserDTO = userMapperImpl.toUserDto(user);

        assertEquals(createdUserDTO.getUsername(), user.getUsername());
    }
}
