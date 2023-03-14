public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog: " + dog + "\n" + "cat: " + cat + "\n" + "paper: " + paper + "\n");
    }

    public static void task2() {
        System.out.println("Задача 2");

        var dog = 8.0;
        dog += 4;
        var cat = 3.6;
        cat += 4;
        var paper = 763789;
        paper += 4;

        System.out.println("dog: " + dog + "\n" + "cat: " + cat + "\n" + "paper: " + paper + "\n");
    }

    public static void task3() {
        System.out.println("Задача 3");

        var dog = 12.0;
        dog -= 3.5;
        var cat = 7.6;
        cat -= 1.6;
        var paper = 763793;
        paper -= 7639;

        System.out.println("dog: " + dog + "\n" + "cat: " + cat + "\n" + "paper: " + paper + "\n");
    }

    public static void task4() {
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);
        friend *= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        System.out.println(weightBoxer1 + weightBoxer2);
        System.out.println(weightBoxer2 - weightBoxer1);
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var differenceWeight1 = boxerWeight2 - boxerWeight1;
        System.out.println("Вычитание из большего веса меньшего: " + differenceWeight1);
        var differenceWeight2 = boxerWeight2 % boxerWeight1;
        System.out.println("С помощь функции остаток от деления: " + differenceWeight2);
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");

        var timeWork = 640;
        var employeeWorkingTime = 8;
        var numberOfEmployees = timeWork / employeeWorkingTime;
        System.out.println("Всего работников в компании - " + numberOfEmployees);
        numberOfEmployees += 94;
        employeeWorkingTime = timeWork / numberOfEmployees;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего "
                + employeeWorkingTime + " часа работы может быть поделено между сотрудниками");
    }
}