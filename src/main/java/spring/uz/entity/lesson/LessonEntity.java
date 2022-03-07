package spring.uz.entity.lesson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.uz.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lesson_sp")
public class LessonEntity extends BaseEntity<String> {

    private String name;
    private boolean start;
    private long nextLessonId;
    private long prevLessonId;
    private String videoUrl;

    @ManyToOne(fetch = FetchType.EAGER)
    private SectionEntity sectionEntity;

}
