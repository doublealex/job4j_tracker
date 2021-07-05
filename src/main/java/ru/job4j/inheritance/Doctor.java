package ru.job4j.inheritance;

public class Doctor extends Profession{

    private String qualification;
    private int experience;

    public Doctor() {
        super();
    }

    public Doctor (String name, String surname, String education, String birthday, String qualification, int experience) {
        super(name, surname, education, birthday);
        this.qualification = qualification;
        this.experience = experience;
    }
}

