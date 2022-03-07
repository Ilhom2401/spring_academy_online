package spring.uz.repository.lesson;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.uz.entity.lesson.LessonEntity;

public interface LessonRepository extends JpaRepository<LessonEntity, Long> {
}
