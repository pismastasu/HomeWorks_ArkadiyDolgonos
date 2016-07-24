package com.levelup.lesson2.tasks;

/**
 * Created by Алевтина on 24.07.2016.
 */
public class TrainingClass {
    private int year;
    private char letter;
    private String name;
    private Student[] students = new Student[10];
    private int studentsCount = 0;

    public TrainingClass() {
    }

    public TrainingClass(char letter, String name) {
        this.letter = letter;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    private boolean addStudent(Student student) {
        if (studentsCount == (students.length - 1)) {
            students[studentsCount++] = student;
            return true;
        }
        return false;
    }
}
