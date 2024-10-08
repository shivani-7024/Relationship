package shivani.springboot_4.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shivani.springboot_4.Entity.CourseEntity;
import shivani.springboot_4.Entity.Gaurdian;
import shivani.springboot_4.Entity.StudentEntity;
import shivani.springboot_4.Entity.TeacherEntity;

import java.util.List;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void findAll() {
        List<CourseEntity> courseEntity = courseRepository.findAll();
        System.out.println(courseEntity);
    }


    @Test
    public void saveTeacher(){
        TeacherEntity teacherEntity = TeacherEntity.builder()
                .teacherFirstName("Mona")
                .teacherLastName("Lisha")
                .build();

        CourseEntity courseEntity = CourseEntity.builder()
                .title("For Teacher")
                .teacher(teacherEntity)
                .credit(21)
                .build();
        courseRepository.save(courseEntity);
    }

    @Test
    public void saveCourseWithStudentAndTeacher() {
        TeacherEntity teacherEntity = TeacherEntity.builder()
                .teacherFirstName("raju")
                .teacherLastName("singh")
                .build();

        Gaurdian guardian = Gaurdian.builder()
                .name("Guardian")
                .email("guardian@gmail.com")
                .mobile("78946554654")
                .build();

        StudentEntity studentEntity = StudentEntity.builder()
                .firstName("std")
                .last_name("stdl")
                .email("std123@gmail.com")
                .gaurdian(guardian)
                .build();

        CourseEntity courseEntity = CourseEntity.builder()
                .title("Course with Teacher and Student")
                .credit(1)
                .teacher(teacherEntity)
                .build();

        // Add student to the course
        courseEntity.addStudent(studentEntity);

        // Save the course, which will also save the student due to CascadeType.ALL
        courseRepository.save(courseEntity);
    }




}