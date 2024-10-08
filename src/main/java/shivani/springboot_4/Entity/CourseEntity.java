package shivani.springboot_4.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.Mapping;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "courseMaterial")
@Table(name = "Course")

public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long courseId;
    private String title;
    private int credit;

    @OneToOne(mappedBy = "course")
    private CourseMaterialEntity courseMaterial;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "Teacher_ki_id",
            referencedColumnName = "teacherId"
    )
    private TeacherEntity teacher;



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_course_map",
            joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "courseId"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "std_id")
    )
    private List<StudentEntity> students;


    public void addStudent(StudentEntity student) {
        if (students == null) students = new ArrayList<>();
        students.add(student);
    }
}
