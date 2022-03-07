package spring.uz.repository.user;


import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import spring.uz.entity.users.UserTaskAnswerEntity;

public interface UserTaskAnswerRepository extends JpaEntityInformation<UserTaskAnswerEntity, Long> {
}
