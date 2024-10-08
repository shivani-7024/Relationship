package shivani.springboot_4.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@ToString(exclude = "course")
@Table(name = "Course_Material")

public class CourseMaterialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long courseMaterialId;
    private String url;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
          name = "courseId",
          referencedColumnName = "courseId"
    )
    private CourseEntity course;
}
