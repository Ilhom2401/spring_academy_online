package spring.uz.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.uz.entity.role.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
