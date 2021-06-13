package by.brel.springbootCRUD.repository;

import by.brel.springbootCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
