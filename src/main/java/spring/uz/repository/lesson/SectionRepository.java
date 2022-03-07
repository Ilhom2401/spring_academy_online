package spring.uz.repository.lesson;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.uz.entity.lesson.SectionEntity;


public interface SectionRepository extends JpaRepository<SectionEntity, Long> {
}
