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
}
