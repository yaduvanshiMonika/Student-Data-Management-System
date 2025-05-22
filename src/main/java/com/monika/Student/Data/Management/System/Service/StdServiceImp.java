package com.monika.Student.Data.Management.System.Service;

import com.monika.Student.Data.Management.System.Entity.Student;
import com.monika.Student.Data.Management.System.dao.StudentRequest;
import com.monika.Student.Data.Management.System.repo.StudentRepo;
import com.monika.Student.Data.Management.System.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StdServiceImp implements StdService{

    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudentByCourse(String courseName) {
        return studentRepo.findByCourse(courseName);
    }

    @Override
    public Student saveStdData(StudentRequest studentRequest) {

        return  studentRepo.save(Utility.Mapper(studentRequest));
    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.getAllStudentData();
    }
}


