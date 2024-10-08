package shivani.springboot_4.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shivani.springboot_4.Entity.CourseEntity;
import shivani.springboot_4.Entity.TeacherEntity;

import java.util.List;

@SpringBootTest
class TeacherEntityRepositoryTest {
    @Autowired
    TeacherEntityRepository teacherEntityRepository;

    @Test
    public void saveTeacherEntity() {

        CourseEntity maths = CourseEntity.builder()
                .title("Maths")
                .credit(4)
                .build();

        CourseEntity english = CourseEntity.builder()
                .title("English")
                .credit(6)
                .build();

        CourseEntity Hindi = CourseEntity.builder()
                .title("Hindi")
                .credit(7)
                .build();

        TeacherEntity teacherEntity = TeacherEntity.builder()
                .teacherFirstName("Rony")
                .teacherLastName("Tongal")
                .courseEntities(List.of(maths, english, Hindi))
                .build();
        teacherEntityRepository.save(teacherEntity);
    }

    @Test
    public void findAll(){
        List<TeacherEntity> list = teacherEntityRepository.findAll();
        System.out.println(list);
    }

}