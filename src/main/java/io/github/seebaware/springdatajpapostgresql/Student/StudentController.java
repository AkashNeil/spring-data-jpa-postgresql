package io.github.seebaware.springdatajpapostgresql.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/student/")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("findAll")
    public List<Student> findAll () {
        return studentService.findAll();
    }

    @GetMapping("findById/{id}")
    public Optional<Student> findById(@PathVariable("id") Long id) {
        return studentService.findById(id);
    }
    
}
