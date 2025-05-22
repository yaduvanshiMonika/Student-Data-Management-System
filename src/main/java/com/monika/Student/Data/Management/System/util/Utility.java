package com.monika.Student.Data.Management.System.util;

import com.monika.Student.Data.Management.System.Entity.Student;
import com.monika.Student.Data.Management.System.dao.StudentRequest;

public class Utility {


    public static Student Mapper(StudentRequest studentRequest)
    {
        Student student =new Student();
        student.setName(studentRequest.getName());
        student.setAddress(studentRequest.getAddress());
        student.setCourse(studentRequest.getCourse());
        return student;


    }
}
