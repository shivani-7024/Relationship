package shivani.springboot_4.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Teacher")
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long teacherId;
    private String teacherFirstName;
    private String teacherLastName;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "Teacher_id",
            referencedColumnName = "teacherId"
    )
    private List<CourseEntity> courseEntities;
}
