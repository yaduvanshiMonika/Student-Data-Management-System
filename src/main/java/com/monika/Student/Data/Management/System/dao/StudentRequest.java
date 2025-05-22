package com.monika.Student.Data.Management.System.dao;

public class StudentRequest {

    int id;

    String name;

    String course;

    String address;

    String DOB;

    String enrollmentNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEnrollmentNum() {
        return enrollmentNum;
    }

    public void setEnrollmentNum(String enrollmentNum) {
        this.enrollmentNum = enrollmentNum;
    }
}
