package ru.gb.lessons;

import HW_Lesson_4.Triangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TriangleAreaTest {
    @Test
    @DisplayName("Площадь треугольника 3, 3, 3 должна быть равна 3.897114317029974")
    public void countAreaATriangleSuccessfulTest() {
        Triangle triangle = new Triangle(3, 3, 3);
        double area = triangle.triangleArea();
        assertEquals(3.897114317029974, area);
    }

    @Test
    @DisplayName("Площадь треугольника 3, 4, 5 должна быть равна 6.0")
    public void countAreaBTriangleSuccessfulTest() {
        Triangle triangle = new Triangle(3, 4, 5);
        double area = triangle.triangleArea();
        assertEquals(6.0, area);
    }

    @Test
    @DisplayName("Площадь треугольника 9, 9, 9 должна быть равна 5.074028853269766")
    public void countAreaCTriangleSuccessfulTest() {
        Triangle triangle = new Triangle(9, 9, 9);
        double area = triangle.triangleArea();
        assertEquals(35.074028853269766, area);
    }
}

