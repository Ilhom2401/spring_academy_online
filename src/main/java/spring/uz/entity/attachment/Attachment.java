package spring.uz.entity.attachment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.uz.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "attachment_sp")
public class Attachment extends BaseEntity<String> {

    private String fileName;
    private String fileContentType;
    private long size; // byte

    @OneToOne(fetch = FetchType.LAZY)
    private AttachmentContent attachmentContent;

}
