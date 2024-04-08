package be.tftic.java.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Entity
//@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Section implements WithId<Long> {

    @Id
    @Column(name = "section_id")
    private Long id;

    @Column(name = "section_name")
    private String name;

    @Column(name = "delegate_id")
    private long delegateId;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDelegateId() {
        return delegateId;
    }

    public void setDelegateId(long delegateId) {
        this.delegateId = delegateId;
    }
}
