package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To6Then6() {
        int result = Max.max(1, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax10To2To7Then10() {
        int result = Max.max(10, 2, 7);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax4To4To7To7Then7() {
        int result = Max.max(4, 4, 7,7);
        assertThat(result, is(7));
    }
}
