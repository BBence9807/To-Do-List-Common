package hu.bb.mapper;

import hu.bb.dto.UserDTO;
import hu.bb.entity.User;

public interface UserMapper {

    public User toUser(UserDTO userDTO);
    public UserDTO toUserDto(User user);
}
