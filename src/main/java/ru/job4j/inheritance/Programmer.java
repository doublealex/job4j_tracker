package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String skill;

    public Programmer() {
    }

    public Programmer(String name, String surname, String education, String birthday, int experience, String degree, String skill) {
        super(name, surname, education, birthday, experience, degree);
        this.skill = skill;
    }
}