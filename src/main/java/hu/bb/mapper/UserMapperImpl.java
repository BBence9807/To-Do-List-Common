package hu.bb.mapper;

import org.springframework.ldap.support.LdapUtils;
import org.springframework.stereotype.Component;

import hu.bb.dto.UserDTO;
import hu.bb.entity.User;

/**
 * User mapper class
 */
@Component
public class UserMapperImpl implements UserMapper {

    /**
     * Convert UserDTO to User 
     */
    @Override
    public User toUser(UserDTO userDTO) {
        return User.builder()
        .id(LdapUtils.newLdapName(userDTO.getId()))
        .username(userDTO.getUsername())
        .email(userDTO.getEmail())
        .build();
    }

    /**
     * Convert User to UserDTO 
     */
    @Override
    public UserDTO toUserDto(User user) {
        return UserDTO.builder()
            .id(user.getId().toString())
            .username(user.getUsername())
            .email(user.getEmail())
            .build();
    }

}
