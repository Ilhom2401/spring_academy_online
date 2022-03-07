package spring.uz.repository.task;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.uz.entity.task.TaskEntity;


public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
