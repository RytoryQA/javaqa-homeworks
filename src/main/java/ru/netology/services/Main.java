package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        CountService service = new CountService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 2;
        actual = service.calculate(100_000, 60_000, 150_000);
        System.out.println("1. " + expected + " == ? == " + actual);

    }
}
