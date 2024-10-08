package shivani.springboot_4.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shivani.springboot_4.Entity.CourseMaterialEntity;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterialEntity, Long> {


}
