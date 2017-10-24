package ru.bstu.iitus.vt41.vba;

import java.util.Scanner;

public class Director extends FellowWorker {
    private String carName;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите марку машины директора:");
        carName = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Марка машины директора " + this.carName;
    }
}
