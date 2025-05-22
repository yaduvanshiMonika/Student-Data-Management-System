package com.monika.Student.Data.Management.System.repo;

import com.monika.Student.Data.Management.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    public List<Student> findByCourse(String course);

    @Query(value = "select * from students",nativeQuery = true)
    public List<Student> getAllStudentData();


}
