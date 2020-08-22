package com.openapi3.example.controller;

import com.openapi3.example.Model.Student;
import com.openapi3.example.Repositories.StudentRepository;
import com.openapi3.example.interfaces.StudentServiceInterface;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@Tag(name = "Students")
public class StudentController implements StudentServiceInterface {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByID(int id){
        return studentRepository.findById(id).get();
    }

}
