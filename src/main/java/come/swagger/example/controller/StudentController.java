package come.swagger.example.controller;

import come.swagger.example.Model.Student;
import come.swagger.example.Repositories.StudentRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentByID(int id){
        return studentRepository.findById(id).get();
    }

}
