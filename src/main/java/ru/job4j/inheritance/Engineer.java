package ru.job4j.inheritance;

public class Engineer extends Profession{

        private int experience;
        private String degree;

        public Engineer() {
            super();
        }

        public Engineer (String name, String surname, String education, String birthday, int experience, String degree) {
            super(name, surname, education, birthday);
            this.experience = experience;
            this.degree = degree;
        }
}
