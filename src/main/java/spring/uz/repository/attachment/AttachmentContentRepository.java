package spring.uz.repository.attachment;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.uz.entity.attachment.AttachmentContent;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Long> {

}
