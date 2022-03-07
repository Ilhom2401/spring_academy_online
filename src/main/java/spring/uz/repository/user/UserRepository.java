package spring.uz.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.uz.entity.users.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByPhoneNumber(String phoneNumber);
    boolean existsByPhoneNumberAndPassword(String phoneNumber, String password);
}
