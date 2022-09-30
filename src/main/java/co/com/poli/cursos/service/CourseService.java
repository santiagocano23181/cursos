package co.com.poli.cursos.service;

import co.com.poli.cursos.persistence.entity.Course;
import co.com.poli.cursos.persistence.entity.Instructor;

import java.util.List;

public interface CourseService {
    Course save(Course course);
    List<Course> findAll();
}
