package com.example.g1app.struct;

public class Course {
    String name;
    Double grade;
    Double credit;
    Double coeff;

    public Course(String name, Double grade, Double credit, Double coeff) {
        this.name = name;
        this.grade = grade;
        this.credit = credit;
        this.coeff = coeff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getCoeff() {
        return coeff;
    }

    public void setCoeff(Double coeff) {
        this.coeff = coeff;
    }
}
