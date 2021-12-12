package io.github.seebaware.springdatajpapostgresql.Student;

import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student create(@RequestBody Student student) {
        Preconditions.checkNotNull(student);
        return studentService.create(student);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Student update(@PathVariable("id") Long id, @RequestBody Student student) {
        Preconditions.checkNotNull(student);
        return studentService.update(student);
    }

    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        studentService.deleteById(id);
    }

}
