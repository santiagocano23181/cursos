package co.com.poli.cursos.persistence.repository;

import co.com.poli.cursos.persistence.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
