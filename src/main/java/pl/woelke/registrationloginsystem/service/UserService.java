package pl.woelke.registrationloginsystem.service;

import pl.woelke.registrationloginsystem.dto.UserDto;

public interface UserService {
    void saveUser(UserDto userDto);

}
