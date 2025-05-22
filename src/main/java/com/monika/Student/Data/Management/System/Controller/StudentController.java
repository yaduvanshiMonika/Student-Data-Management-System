package com.monika.Student.Data.Management.System.Controller;


import com.monika.Student.Data.Management.System.Entity.Student;
import com.monika.Student.Data.Management.System.Service.StdService;
import com.monika.Student.Data.Management.System.dao.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/std")
public class StudentController {

    @Autowired
    StdService stdService;

    @GetMapping("/get/{courseName}")
    public List<Student> getStudentByCourse(@PathVariable String courseName)
    {
        List<Student>allStudentByCourse =stdService.getAllStudentByCourse(courseName);
        return allStudentByCourse;
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody StudentRequest studentRequest)
    {
        return stdService.saveStdData(studentRequest);
    }

    @DeleteMapping("/delete/{id}")

    @GetMapping("/get")
    public List<Student> getAllStudent()
    {
        List<Student> allStudent =stdService.getAllStudent();
        return allStudent;
    }

}
