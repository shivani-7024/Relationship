package shivani.springboot_4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shivani.springboot_4.Entity.StudentEntity;


@Repository
public interface Student_repository extends JpaRepository<StudentEntity, Long> {

}
