package ru.job4j.inheritance;

public class Doctor extends Profession{

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnoz = new Diagnosis();
        return diagnoz;
    }

}
