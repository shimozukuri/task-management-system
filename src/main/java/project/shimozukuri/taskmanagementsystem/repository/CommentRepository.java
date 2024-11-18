package project.shimozukuri.taskmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.shimozukuri.taskmanagementsystem.domain.task.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
