package com.richardmcewan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CircleTest {



    @Test
    @DisplayName("getRadius handles zero")
    void getRadiusWithZero() {
        Circle circle = new Circle(0);
        Assertions.assertEquals(0, circle.getRadius());
    }

    @Test
    @DisplayName("getRadius handles negative values and return 0")
    void getRadiusWithNegative() {
        Circle circle = new Circle(-5);
        Assertions.assertEquals(0, circle.getRadius());
    }

    @Test
    @DisplayName("getRadius with integer one")
    void getRadiusWithOne() {
        Circle circle = new Circle(1);
        Assertions.assertEquals(1, circle.getRadius());
    }

    @Test
    @DisplayName("getRadius with decimal")
    void getRadiusWithDecimal() {
        Circle circle = new Circle(0.1);
        Assertions.assertEquals(0.1, circle.getRadius());
    }

    @Test
    @DisplayName("getRadius with very small decimal")
    void getRadiusWithVerySmallDecimal() {
        Circle circle = new Circle(0.000000001);
        Assertions.assertEquals(0.000000001, circle.getRadius());
    }


    @Test
    @DisplayName("getArea check with 0")
    void getAreaWithZero() {
        Circle circle = new Circle(0);
        Assertions.assertEquals(0, circle.getArea());
    }

    @Test
    @DisplayName("getArea should return 0 for negative values")
    void getAreaWithNegative(){
        Circle circle = new Circle(-1);
        Assertions.assertEquals(0, circle.getArea());
    }

    @Test
    @DisplayName("getArea should return PI with radius one")
    void getAreaShouldReturnPIWithRadiusOne() {
        Circle circle = new Circle(1);
        Assertions.assertEquals(1*1*Math.PI, circle.getArea());
    }

    @Test
    @DisplayName("getArea should correct value for radius two")
    void getAreaRadiusTwo() {
        Circle circle = new Circle(2);
        Assertions.assertEquals(2*2*Math.PI, circle.getArea());
    }

    @Test
    @DisplayName("getAreaWithSmallDecimal")
    void getAreaWithSmallDecimal() {
        Circle circle = new Circle(0.00000002);
        Assertions.assertEquals(0.00000002*0.00000002*Math.PI, circle.getArea());
    }

    @Test
    @DisplayName("getAreaWithLargeDecimal")
    void getAreaWithLargeDecimal() {
        Circle circle = new Circle(125.12345);
        Assertions.assertEquals(125.12345*125.12345*Math.PI, circle.getArea());
    }

    @Test
    @DisplayName("getAreaWithAnotherLargeDecimal")
    void getAreaWithAnotherLargeDecimal() {
        Circle circle = new Circle(999.999);
        Assertions.assertEquals(999.999*999.999*Math.PI, circle.getArea(), 0.0001);
    }


}