package ru.bstu.iitus.vt41.vba;

import java.util.Scanner;

public class Teacher extends FellowWorker {
    private String certifNum;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите номер сертификата");
        certifNum = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Номер сертификата учителя " + this.certifNum + " с опытом работы " + super.expirience;
    }
}
