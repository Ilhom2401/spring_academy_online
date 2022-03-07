package spring.uz.entity.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.uz.entity.base.BaseEntity;
import spring.uz.entity.lesson.SectionEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "task_sp")
public class TaskEntity extends BaseEntity<String> {

    private String question;
    private String taskUrl; // it can be image, pdf, word

    @Enumerated(EnumType.STRING)
    private TaskLevel taskLevel;

    @ManyToOne(fetch = FetchType.EAGER)
    private SectionEntity sectionEntity;

}
