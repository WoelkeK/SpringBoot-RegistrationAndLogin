package pl.woelke.registrationloginsystem.service;

import pl.woelke.registrationloginsystem.dto.UserDto;
import pl.woelke.registrationloginsystem.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
