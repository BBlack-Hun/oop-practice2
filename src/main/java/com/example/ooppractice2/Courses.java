package com.example.ooppractice2;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }
        return multipliedCreditAndCourseGrade;
    }

    public int calculateTotalCompledtedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
