package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void pour(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(200);
        Battery second = new Battery(50);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.pour(second);
        System.out.println("first : " + first.load + ". second : " + second.load);

    }
}