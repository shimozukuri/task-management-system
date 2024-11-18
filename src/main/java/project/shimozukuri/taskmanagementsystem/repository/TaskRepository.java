package project.shimozukuri.taskmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.shimozukuri.taskmanagementsystem.domain.task.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
