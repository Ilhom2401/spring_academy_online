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
@Table(name = "user_section_sp")
public class UserSectionEntity extends BaseEntity<String> {

    private long userId;
    private long userSectionId;
    private boolean isOpen;
}
