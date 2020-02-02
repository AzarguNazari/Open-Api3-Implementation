package come.swagger.example.controller;

import come.swagger.example.Model.Student;
import come.swagger.example.Repositories.StudentRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@Tag(name = "Students")
public class StudentController {

    private StudentRepository studentRepository;

    @Operation(summary = "get list of students")
    @GetMapping("/")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @ApiResponses(value = {@ApiResponse(description = "Succesfull", responseCode = "200", content = @Content(schema = @Schema(implementation = Student.class)))})
    @Operation(summary = "get specificat student")
    @GetMapping("/{studentID}")
    public Student getStudentByID(@PathVariable("studentID") int id){
        return studentRepository.findById(id).get();
    }

}
