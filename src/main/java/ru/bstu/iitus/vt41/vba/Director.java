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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Director director = (Director) obj;
        return carName != null && carName.equals(director.carName);
    }

    @Override
    public int hashCode() {
        return carName == null ? 0 : carName.hashCode();
    }
}
