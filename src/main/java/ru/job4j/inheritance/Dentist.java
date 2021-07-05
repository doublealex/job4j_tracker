package ru.job4j.inheritance;

public class Dentist extends Doctor{

    private String specialization;

    public Dentist() {
    }

    public Dentist(String name, String surname, String education, String birthday, String qualification, int experience, String specialization) {
        super(name, surname, education, birthday, qualification, experience);
        this.specialization = specialization;
    }
}