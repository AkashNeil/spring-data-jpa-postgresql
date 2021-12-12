package io.github.seebaware.springdatajpapostgresql.Student;

import io.github.seebaware.springdatajpapostgresql.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
