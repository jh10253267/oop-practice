package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class GradeCalculatorTest {

    @Test
    void calculateGradeTest() {
        List<Course> course = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(course);
        double gradeResult = gradeCalculator.calculateGrade();
        assertThat(gradeResult).isEqualTo(4.5);
    }
}
