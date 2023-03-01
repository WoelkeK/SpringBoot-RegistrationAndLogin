package pl.woelke.registrationloginsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.woelke.registrationloginsystem.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
