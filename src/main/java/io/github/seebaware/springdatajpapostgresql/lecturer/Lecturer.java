package io.github.seebaware.springdatajpapostgresql.lecturer;

import javax.persistence.*;

@Entity(name = "Lecturer")
@Table(name = "lecturer")
public record Lecturer(@Id Long id, String firstName, String lastName, String email) {

}
