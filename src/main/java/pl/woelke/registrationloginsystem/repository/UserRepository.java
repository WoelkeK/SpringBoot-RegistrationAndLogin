package pl.woelke.registrationloginsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.woelke.registrationloginsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    UserRepository findByEmail(String email);
}
