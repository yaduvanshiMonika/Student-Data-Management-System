package com.monika.Student.Data.Management.System.Service;

import com.monika.Student.Data.Management.System.Entity.Student;
import com.monika.Student.Data.Management.System.dao.StudentRequest;

import java.util.List;

public interface StdService {
    public List<Student> getAllStudentByCourse(String courseName);

    Student  saveStdData(StudentRequest studentRequest);

    void deleteStudent(int id);


    List<Student> getAllStudent();
}
