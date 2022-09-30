package co.com.poli.cursos.service;

import co.com.poli.cursos.persistence.entity.Course;
import co.com.poli.cursos.persistence.entity.Instructor;

import java.util.List;

public interface InstructorService {
    Instructor save(Instructor instructor);
    List<Instructor> findAll();
}
