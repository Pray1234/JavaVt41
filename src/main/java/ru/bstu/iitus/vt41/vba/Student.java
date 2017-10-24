package ru.bstu.iitus.vt41.vba;

import java.util.Scanner;

public class Student extends Person {
    private String groupNum;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите возраст студента:");
        super.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите номер группы:");
        this.groupNum = scanner.nextLine();
    }

    @Override
    public int getAge() {
        return super.age;
    }

    @Override
    public String toString() {
        return "Номер группы студента " + this.groupNum;
    }
}
