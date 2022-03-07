package spring.uz.entity.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.uz.entity.base.BaseEntity;
import spring.uz.entity.role.RoleEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users_sp")
public class UserEntity extends BaseEntity<String> {

    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    @Column(unique = true, nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String password;

    @ManyToMany
    @JoinTable(
            name = "user_role_sp",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<RoleEntity> roleEntityList;


}
