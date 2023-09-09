package ru.roman.lab7_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.roman.lab7_1.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
