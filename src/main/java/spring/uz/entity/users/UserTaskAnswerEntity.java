package spring.uz.entity.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.uz.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user_task_answer_sp")
public class UserTaskAnswerEntity extends BaseEntity<String> {

    private long checkedBy;
    private long completedBy;
    private double score;
    private long taskId;

}
