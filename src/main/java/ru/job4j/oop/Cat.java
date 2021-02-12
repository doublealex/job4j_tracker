package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void eat(String meal) {
        this.food = meal;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public static void main(String[] args) {
        System.out.println("There are gav's name & food:");
        Cat gav = new Cat();
        gav.giveNick("Котенок Гав");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's name & food:");
        Cat black = new Cat();
        black.giveNick("Черный котенок");
        black.eat("fish");
        black.show();
    }
}