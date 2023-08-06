package com.Kevin.SpringReactProject.Controller;

import com.Kevin.SpringReactProject.Model.Student;
import com.Kevin.SpringReactProject.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
public String add(@RequestBody Student student){
       studentService.saveStudent(student);
        return "New student has been added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
