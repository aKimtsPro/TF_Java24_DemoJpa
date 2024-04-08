package be.tftic.java.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Section {

    @Id
    @Column(name = "section_id")
    private long id;

    @Column(name = "section_name")
    private String name;

    @Column(name = "delegate_id")
    private long delegateId;
}
