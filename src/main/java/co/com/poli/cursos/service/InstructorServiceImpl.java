package co.com.poli.cursos.service;

import co.com.poli.cursos.persistence.entity.Course;
import co.com.poli.cursos.persistence.entity.Instructor;
import co.com.poli.cursos.persistence.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService{

    private final InstructorRepository repository;

    @Override
    public Instructor save(Instructor instructor) {
        return repository.save(instructor);
    }

    @Override
    public List<Instructor> findAll() {
        return repository.findAll();
    }
}
