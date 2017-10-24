package ru.bstu.iitus.vt41.vba;

import java.util.Scanner;

public class Institution {
    private Person[] array;

    public Institution(int sizeArray) {
        array = new Person[sizeArray];
    }

    public void addPersons(Scanner scanner) {
        try {
            for (int i = 0; i < this.array.length; i++) {
                int type;
                System.out.println("Введите тип персоны, которой вы хотите добавить: "
                        + "0: Ученик; 1: Студент; 2: Учитель; 3: Директор");
                type = scanner.nextInt();
                switch (type) {
                    case 0:
                        this.array[i] = new Pupil();
                        break;
                    case 1:
                        this.array[i] = new Student();
                        break;
                    case 2:
                        this.array[i] = new Teacher();
                        break;
                    case 3:
                        this.array[i] = new Director();
                        break;
                    default:
                        throw new Exception();
                }
                array[i].init(scanner);
            }
        } catch (Exception ex) {
            System.out.println("Неправильный выбор типа");
        }
    }

    public Person youngest() {
        int minAge = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < this.array.length; i++) {
            int currentAge = this.array[i].getAge();
            if (currentAge < minAge) {
                minIndex = i;
                minAge = currentAge;
            }
        }
        return this.array[minIndex];
    }
}
