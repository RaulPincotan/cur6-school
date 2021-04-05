package ro.fasttrackit.curs6.cur6school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs6.cur6school.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
