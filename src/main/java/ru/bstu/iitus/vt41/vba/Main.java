package ru.bstu.iitus.vt41.vba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество персон: ");
        int size;
        try {
            size = scanner.nextInt();
            if (size < 0) {
                throw new Exception();
            }
            Institution institution = new Institution(size);
            institution.addPersons(scanner);
            System.out.println(institution.youngest().toString());
        } catch (Exception ex) {
            System.out.println("Неправильный ввод");
        }
    }
}
