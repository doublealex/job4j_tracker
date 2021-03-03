package ru.job4j.oop;


import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0,0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to42then2p82() {
        double expected = 2.82;
        Point a = new Point(2,4);
        Point b = new Point(4,2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}