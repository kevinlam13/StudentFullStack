package com.Kevin.SpringReactProject.Service;

import com.Kevin.SpringReactProject.Model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    }

