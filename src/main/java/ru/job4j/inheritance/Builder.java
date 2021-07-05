package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int expertize;

    public Builder() {
    }

    public Builder(String name, String surname, String education, String birthday, int experience, String degree, int expertize) {
        super(name, surname, education, birthday, experience, degree);
        this.expertize = expertize;
    }
}