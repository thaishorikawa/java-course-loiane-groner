package com.javacourse.loiane.lesson33.review;

public class Student {

    private String name;
    private String idNumber;
    private String courseName;
    private String[] subjectNames;
    private double[][] grades;

    public Student() {
        setSubjectNames(new String[3]);
        setGrades(new double[3][4]);
    }

    public Student(String name, String idNumber, String courseName) {
        this.setName(name);
        this.setIdNumber(idNumber);
        this.setCourseName(courseName);
        this.setSubjectNames(new String[3]);
        this.setGrades(new double[3][4]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String[] getSubjectNames() {
        return subjectNames;
    }

    public void setSubjectNames(String[] subjectNames) {
        this.subjectNames = subjectNames;
    }

    public double[][] getGrades() {
        return grades;
    }

    public void setGrades(double[][] grades) {
        this.grades = grades;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID number: " + idNumber);
        System.out.println("Name of the course: " + courseName);

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grades of " + subjectNames[i]);
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean checkApproved(int index) {
        double sum = 0;

        for (int i = 0; i < grades[index].length; i++) {
            sum += grades[index][i];
        }

        double media = sum / 4;

        if (media >= 7) {
            return true;
        }
        return false;
    }

    public void setSubjectNamePos(int pos, String subjectName) {
        this.subjectNames[pos] = subjectName;
    }

    public void setGradesPosIJ(int posI, int posJ, double grade) {
        this.grades[posI][posJ] = grade;
    }
}
