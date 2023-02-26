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
    int age = 18;
        System.out.println("Возраст " + age + " лет");
    if (age >=18) {
        System.out.println(" он совершеннолетний");
    } else {
        System.out.println(" он не достиг совершеннолетия, нужно подождать");
    }}
    public static void task2() {
        System.out.println("Задача 2");
        int temp = 5;
        System.out.println(" Температура " + temp + " градусов");
        if (temp >=5) {
            System.out.println(" Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println(" На улице холодно, нужно надеть шапку");
        }}
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 60;
        System.out.println("Скорость " + speed + " км/ч");
        if (speed >=60) {
            System.out.println("Придется заплатить штраф");
        } else {
            System.out.println("Превышения скорости нет");
        }}
    public static void task4() {
        System.out.println("Задача 4");
        int a = 10;
        System.out.println(a + " лет");
        if (a >= 2 && a <= 6) {
            System.out.println("Нужно ходить в детский сад");
        } else if (a >= 7 && a < 18) {
            System.out.println("Нужно ходить в школу");}

         else if (a >= 18 && a < 24) {
            System.out.println("Нужно хдодить в университет");}

        else if (a >= 24 ) {
            System.out.println("Нужно ходить на работу");
                    }
    }
            public static void task5() {
            System.out.println("Задача 5");
            int age = 10;
                System.out.println(age + " возраст ребенка");
                if (age < 5) {
                System.out.println("не может кататься");
                } else if (age < 14) {
                    System.out.println("в сопровождении взрослого");
                } else {
                    System.out.println("можно одному");
                }
                }
            public static void task6() {
            System.out.println("Задача 6");
            int peoples = 70;
                System.out.println(peoples + " кол-во пассажиолв");
                if (peoples < 60) {
                    System.out.println("есть сидячие места");
                } else if (peoples >= 60 && peoples <112) {
                    System.out.println("только стоячие места");
                } else {
                    System.out.println("мест нет");
                }
        }
        public static void task7() {
        System.out.println("Задача 7");
        int one = 40;
            System.out.println(one + " первое число");
        int two = 14;
            System.out.println(two + " второе число");
        int three = 36;
            System.out.println(three + " третье число");
            if (one < two && two > three) {
                System.out.println("второе число самое большое");
            } else if (two < three && three > one) {
                System.out.println("третье число самое большое");
            } else {
                System.out.println("первое число самое большое");
            }
            }


}

