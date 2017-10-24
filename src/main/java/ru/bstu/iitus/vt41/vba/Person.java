package ru.bstu.iitus.vt41.vba;

import java.util.Scanner;

public abstract class Person {
    protected int age;

    public abstract void init(Scanner scanner);

    public abstract int getAge();
}
