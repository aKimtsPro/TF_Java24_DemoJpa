package be.tftic.java.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course implements WithId<String> {

    @Id
    @Column(name = "course_id")
    private String id;

    @Column(name = "course_name")
    private String name;

    @Column(name = "course_ects")
    private double ects;

    @Column(name = "professor_id")
    private long profId;

}
