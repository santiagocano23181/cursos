package co.com.poli.cursos.controller;

import co.com.poli.cursos.persistence.entity.Course;
import co.com.poli.cursos.persistence.entity.Instructor;
import co.com.poli.cursos.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course save(@RequestBody Course course){
        return courseService.save(course);
    }

    @GetMapping
    public List<Course> findAll(){
        return courseService.findAll();
    }
}
