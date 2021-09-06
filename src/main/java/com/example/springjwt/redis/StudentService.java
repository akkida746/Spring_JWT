package com.example.springjwt.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public void updateStudent(String name){
        Student student = new Student(name);
        studentRepository.save(student);
    }

    public Optional<Student> getStudent(String name){
        return studentRepository.findById(name);
    }
}
