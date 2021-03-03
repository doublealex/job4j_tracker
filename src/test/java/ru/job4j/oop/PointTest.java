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

    @Test
    public void when000to222then3p46() {
        double expected = 3.46;
        Point a = new Point(0, 0,0);
        Point b = new Point(2, 2, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when246to642then5p65() {
        double expected = 5.65;
        Point a = new Point(2,4, 6);
        Point b = new Point(6, 4,2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}