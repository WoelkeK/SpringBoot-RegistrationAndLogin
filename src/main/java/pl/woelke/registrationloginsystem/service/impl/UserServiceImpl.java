package pl.woelke.registrationloginsystem.service.impl;

import org.springframework.stereotype.Service;
import pl.woelke.registrationloginsystem.dto.UserDto;
import pl.woelke.registrationloginsystem.entity.Role;
import pl.woelke.registrationloginsystem.entity.User;
import pl.woelke.registrationloginsystem.repository.RoleRepository;
import pl.woelke.registrationloginsystem.repository.UserRepository;
import pl.woelke.registrationloginsystem.service.UserService;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void saveUser(UserDto userDto) {
        User user = new User();
        user.setName((userDto.getFirstName()+ " " + userDto.getLastName()));
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        Role role = roleRepository.findByName("ROLE_ADMIN");
        if(role == null){
            role = checkRoleExist();
        }
        user.setRoles((Arrays.asList(role)));
        userRepository.save(user);
    }

    private Role checkRoleExist(){
        Role role = new Role();
        role.setName("ROLE_ADMIN");
        return roleRepository.save(role);
    }

}
