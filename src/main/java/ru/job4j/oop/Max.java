package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        boolean cond = first > second;
        return cond ? first : second;
        }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
        }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second, third), fourth);
    }

}
