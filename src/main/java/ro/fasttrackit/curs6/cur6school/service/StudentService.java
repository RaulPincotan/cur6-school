package ro.fasttrackit.curs6.cur6school.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.curs6.cur6school.entity.Student;
import ro.fasttrackit.curs6.cur6school.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Optional<Student> getStudent(long studentId) {
        return repository.findById(studentId);
    }
}
