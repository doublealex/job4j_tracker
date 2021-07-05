package ru.job4j.inheritance;

public class Surgeon extends Doctor{

    private String operation;

public Surgeon() {
        }

public Surgeon (String name, String surname, String education, String birthday, String qualification, int experience, String operation) {
        super(name, surname, education, birthday, qualification, experience);
        this.operation = operation;
        }
}
