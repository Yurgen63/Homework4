//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 7;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int year = 30;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в детский сад.");
        } else if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в школу.");
        } else if (year >= 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в университет.");
        } else if (year > 24) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить на работу.");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int year = 5;
        if (year <= 5) {
            System.out.println("Если возраст ребенка равен " + year + ", то ему нельзя кататься на аттракционе.");
        } else if (year > 5 && year <= 14) {
            System.out.println("Если возраст ребенка равен " + year + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (year > 14) {
            System.out.println("Если возраст ребенка равен " + year + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int passеnger = 42;
        int maxPassenger = 102;
        int sittingPassenger = 60;
        int newSittingPassenger = sittingPassenger - passеnger;
        int newMaxPassenger = maxPassenger - passеnger;
        if (passеnger < sittingPassenger) {
            System.out.println("В вагоне есть " + newSittingPassenger + " сидячих мест и 42 стоячих мест ");
        } else if (passеnger >= sittingPassenger && passеnger < maxPassenger) {
            System.out.println("В вагоне есть только " + newMaxPassenger + " стоячиx мест");
        } else {
            System.out.println("В вагоне не осталось свободных мест");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 15;
        int two = 70;
        int three = 9;
        if (one > two && one > three) {
            System.out.println("Число " + one + " большее");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " большее");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " большее");
        }
    }

}