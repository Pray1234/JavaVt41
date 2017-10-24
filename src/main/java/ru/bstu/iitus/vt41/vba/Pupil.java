package ru.bstu.iitus.vt41.vba;

import java.util.Scanner;

public class Pupil extends Person {
    private String firstName;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите возраст ученика:");
        super.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите имя ученика:");
        this.firstName = scanner.nextLine();
    }

    @Override
    public int getAge() {
        return super.age;
    }

    @Override
    public String toString() {
        return "Имя ученика " + this.firstName + " с возрастом " + super.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pupil pupil = (Pupil) obj;
        return firstName != null && firstName.equals(pupil.firstName);
    }

    @Override
    public int hashCode() {
        return firstName == null ? 0 : firstName.hashCode();
    }
}
