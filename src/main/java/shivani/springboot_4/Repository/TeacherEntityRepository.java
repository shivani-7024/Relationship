package shivani.springboot_4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shivani.springboot_4.Entity.TeacherEntity;

@Repository
public interface TeacherEntityRepository extends JpaRepository<TeacherEntity, Long> {

}
