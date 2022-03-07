package spring.uz.repository.user;


import org.springframework.data.jpa.repository.JpaRepository;
import spring.uz.entity.users.UserSectionEntity;

public interface UserSectionRepository extends JpaRepository<UserSectionEntity, Long> {
}
