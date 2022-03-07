package spring.uz.entity.course;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.uz.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "course_sp")
public class CourseEntity extends BaseEntity<String> {

    private String imageUrl;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "courseEntity"
    )
    private List<CourseModuleEntity> courseModuleEntityList;



}
