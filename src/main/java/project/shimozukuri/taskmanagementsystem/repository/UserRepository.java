package project.shimozukuri.taskmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.shimozukuri.taskmanagementsystem.domain.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
