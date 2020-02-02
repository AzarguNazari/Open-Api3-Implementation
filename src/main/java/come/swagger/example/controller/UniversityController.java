package come.swagger.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/university")
@Tag(name = "Univeristy")
public class UniversityController {

    private String university = "University of Bamberg";

    @Operation(summary = "get name of university")
    @GetMapping("/name")
    public String getUnviersityName(){
        return university;
    }


}
