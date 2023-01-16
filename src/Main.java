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

    public static void task1 () {
        System.out.println("Задача 1");
        int manYears = 18;
        if (manYears < 18) {
            System.out.println( "Если возраст человека равен " + manYears + " годам, то он не достиг совершеннолетия, нужно немного подождать");
        }
        if (manYears >= 18) {
            System.out.println( "Человеку " + manYears + " лет, он совершеннолетний!");
        }
        if (manYears < 18) {
            System.out.println( " ты еще мал, тебе " + manYears + " лет!!");
        } else {
            System.out.println( "Да ты совершеннолетний ");}
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int t = 7;
        if (t <= 5) {
            System.out.println( "На улице холодно, нужно надеть шапку");
        }
        if (t > 5) {
            System.out.println( "Сегодня тепло, можно идти без шапки!");
        }
        if (t <= 5) {
            System.out.println( " На улице " + t + " градусов, нужно надеть шапку! ");
        } else {
            System.out.println( "На улице " + t + " градусов, можно идти без шапки! ");}

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 90;
        System.out.println( " Наша скорость - " + speed + " км в час!");
        if (speed <= 60) {
            System.out.println( "превышения скорости нет");
        }
        if (speed > 60) {
            System.out.println( "скорость превышена!");
        }
        if (speed <= 60) {
            System.out.println( "Если скорость " + speed + " , то  можно ездить спокойно ");
        } else {
            System.out.println( "Если скорость " + speed + " , то придется заплатить штраф!!");}

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 4;
        if ( age >= 2 && < 7) {
            System.out.println( "Тебе следует ходить в детсад");
        }
        if (age >=7 && => 18) {
            System.out.println( "Идем в школу");}
        if (age >= 19 && => 24) {
            System.out.println( "Идем в институт");
        }
        if (age >= 25) {
            System.out.println( "Идем на работу");
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");

    }
    public static void task6 () {
        System.out.println("Задача 6");

    }
    public static void task7 () {
        System.out.println("Задача 7");

    }
}