package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifAndDiv(double first, double second) {
        return dif(first, second)
                + div(first, second);
    }

    public static double sumOfEverything(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + div(first, second)
                + dif(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма разности и деления равна: " + sumDifAndDiv(10, 20));
        System.out.println("Сумма всех действий равна: " + sumOfEverything(10, 20));
    }
}