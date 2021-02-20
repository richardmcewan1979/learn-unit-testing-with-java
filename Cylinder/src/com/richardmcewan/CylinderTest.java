package com.richardmcewan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest extends CircleTest {

    @Test
    void getHeightWithZero() {
        Cylinder cylinder = new Cylinder(0,0);
        Assertions.assertEquals(0, cylinder.getHeight());
    }


    @Test
    @DisplayName("getHeight with negative height should return zero")
    void getHeightWithNegativeHeight() {
        Cylinder cylinder = new Cylinder(2,-3);
        Assertions.assertEquals(0, cylinder.getHeight());
    }

    @Test
    @DisplayName("getHeight with nominal decimal number check function")
    void getHeight() {
        Cylinder cylinder = new Cylinder(2,999.55555);
        Assertions.assertEquals(999.55555, cylinder.getHeight());
    }


    @Test
    void getVolumeWithNegativeValueRadius() {
        Cylinder cylinder = new Cylinder(-2,1.5);
        Assertions.assertEquals(0, cylinder.getVolume());
    }

    @Test
    @DisplayName("getVolume with negative height")
    void getVolumeWithNegativeHeight() {
        Cylinder cylinder = new Cylinder(1.5,0);
        Assertions.assertEquals(0, cylinder.getVolume());
    }

    @Test
    @DisplayName("getVolume with zero values")
    void getVolumeWithZeroValues() {
        Cylinder cylinder = new Cylinder(0,0);
        Assertions.assertEquals(0, cylinder.getVolume());

        Cylinder cylinder1 = new Cylinder(0,1.5);
        Assertions.assertEquals(0, cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(1.5,0);
        Assertions.assertEquals(0, cylinder2.getVolume());
    }

    @Test
    @DisplayName("getVolume with nominal decimal values")
    void getVolumeWithNominalDecimalValues() {
        double radius = 12345.6789;
        double height = 98765.4321;
        Cylinder cylinder = new Cylinder(radius,height);
        Assertions.assertEquals(Math.PI*radius*radius*height, cylinder.getVolume());
    }
}