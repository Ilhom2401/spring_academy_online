package spring.uz.entity.course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.uz.entity.base.BaseEntity;
import spring.uz.entity.lesson.SectionEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "course_module_sp")
public class CourseModuleEntity extends BaseEntity<String> {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    private double discount;

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "courseModuleEntity"
    )
    private List<SectionEntity> sectionEntityList;


    @ManyToOne(fetch = FetchType.EAGER)
    private CourseEntity courseEntity;

}
