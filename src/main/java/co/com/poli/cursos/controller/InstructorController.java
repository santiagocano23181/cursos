package co.com.poli.cursos.controller;

import co.com.poli.cursos.persistence.entity.Instructor;
import co.com.poli.cursos.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @PostMapping
    public Instructor save(@RequestBody Instructor instructor){
        return instructorService.save(instructor);
    }

    @GetMapping
    public List<Instructor> findAll(){
        return instructorService.findAll();
    }
}
