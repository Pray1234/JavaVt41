package ru.bstu.iitus.vt41.vba;

import java.util.Scanner;

public class FellowWorker extends Person {
    protected String expirience;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Введите возраст: ");
        super.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите опыт работы: ");
        expirience = scanner.nextLine();
    }

    @Override
    public int getAge() {
        return super.age;
    }

    @Override
    public String toString() {
        return "Опыт работы сотрудника " + this.expirience;
    }
}
