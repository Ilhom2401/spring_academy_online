package spring.uz.repository.course;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.uz.entity.course.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity,Long> {

}
