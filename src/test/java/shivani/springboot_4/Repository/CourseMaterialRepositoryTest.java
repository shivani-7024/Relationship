package shivani.springboot_4.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shivani.springboot_4.Entity.CourseEntity;
import shivani.springboot_4.Entity.CourseMaterialEntity;

import java.util.List;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    CourseMaterialRepository courseMaterialRepository;
    @Test
    public void saveCourseMaterial() {
        CourseEntity courseEntity = CourseEntity.builder()
                .title("Course Title")
                .credit(23)
                .build();
        CourseMaterialEntity courseMaterialEntity = CourseMaterialEntity.builder()
                .url("www.google.com")
                .course(courseEntity)
                .build();
        courseMaterialRepository.save(courseMaterialEntity);

    }

    @Test
    public void printCourseMaterial() {
        List<CourseMaterialEntity> courseMaterialEntityList = courseMaterialRepository.findAll();
        System.out.println(courseMaterialEntityList);
    }

}