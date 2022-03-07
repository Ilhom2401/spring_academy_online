package spring.uz.repository.attachment;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.uz.entity.attachment.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment,Long> {
}
