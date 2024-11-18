package project.shimozukuri.taskmanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.shimozukuri.taskmanagementsystem.domain.user.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);

}
