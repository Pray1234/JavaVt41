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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return groupNum != null && groupNum.equals(student.groupNum);
    }

    @Override
    public int hashCode() {
        return groupNum == null ? 0 : groupNum.hashCode();
    }
}
