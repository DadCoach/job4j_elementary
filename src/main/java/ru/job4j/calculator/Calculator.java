package ru.job4j.calculator;

public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
    }

    public static class ArgMethod {
        public static void hello(String name, int age) {
            System.out.println("Hello, " + name + ", age = " + age);
        }

        public static void main(String[] args) {
            String name = "Job4j";
            int age = 6;
            ArgMethod.hello(name, age);
            ArgMethod.hello(name, age);
            ArgMethod.hello(name, age);
            ArgMethod.hello(name, age);
        }
    }

    public static class Echo {
    }

    public static class Info {
        public static void main(String[] args) {
            System.out.println("05.02.2023");
        }
    }
}
