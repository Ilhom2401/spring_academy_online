package spring.uz.repository.course;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.uz.entity.course.CourseModuleEntity;

public interface CourseModuleRepository extends JpaRepository<CourseModuleEntity,Long> {

}
