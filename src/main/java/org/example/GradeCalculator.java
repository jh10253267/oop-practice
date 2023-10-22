package org.example;

import java.util.List;

//학점수  곱하기 교과목 평점에 합계 나누기.
//일급 컬렉션 사용.
public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        double totalCompletedCredit = courses.calculateTotalCompletedCredit();
        double multipliedCreditAndCourseGrade = courses.multiplyCreditAndCoursesGrade();
        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }

}
