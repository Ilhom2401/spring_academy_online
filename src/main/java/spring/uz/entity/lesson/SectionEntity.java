package spring.uz.entity.lesson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.uz.entity.base.BaseEntity;
import spring.uz.entity.course.CourseModuleEntity;
import spring.uz.entity.task.TaskEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "section_sp")
public class SectionEntity extends BaseEntity<String> {

    private String name;

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "sectionEntity"
    )
    private List<LessonEntity> lessonEntityList;

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "sectionEntity"
    )
    private List<TaskEntity> taskEntityList;

    @ManyToOne(fetch = FetchType.EAGER)
    private CourseModuleEntity courseModuleEntity; // TODO Axror Jahongir va Quvonchga mappedBy ni exampleda tushuntirasan

}
