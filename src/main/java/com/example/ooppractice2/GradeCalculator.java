package com.example.ooppractice2;

import java.util.List;

public class GradeCalculator {

    private final List<Course> courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * 요구사항
     * 평균학점 계산 방법 = (학점수 * 교과목 평점)의합계 / 수강신청 총 학점 수
     * 일급 컬렉션 사용
     *
     * @return 학점
     */
    public double calculate() {
        // 메소드 구현 부분
        // (학점수 + 교과목의 평점)의 합계
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
        }

        // 수강신청의 총 학점
        int totalCompletedCredit = courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
        multipliedCreditAndCourseGrade /= totalCompletedCredit;
        return multipliedCreditAndCourseGrade;
    }
}
