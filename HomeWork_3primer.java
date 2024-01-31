package HomeWork;

import java.util.Scanner;

public class HomeWork_3primer {
    public static void main(String[] args) {

        // 1. Написать функцию, которая принимает на вход 3
        // параметра - имя, фамилию и возраст и выводит
        // их на экран построчно; строки перевести в верхний регистр.

        System.out.println("Имя: ");
        Scanner scanner = new Scanner(System.in);
        String имя = scanner.nextLine();
        System.out.println("Привет, " + имя);
        System.out.println("Фамилия: ");
        String фамилия = scanner.nextLine();
        System.out.println("Возраст: ");
        int возраст = scanner.nextInt();
        System.out.println("имя: " + имя + ", фамилия: " + фамилия + ", возраст: " + возраст);
        String s = new String ("имя, фамилия, возраст");
        System.out.println(s.toUpperCase());

        // 2. Вырезать из строки "Вход запрещен сегодня" второе
        // слово и заменить его на "разрешен".

        String d = "Вход запрещен сегодня";
        System.out.println("Вход запрещен сегодня");
        System.out.println(d.replace("запрещен", "разрешен"));

        // 3. Написать функцию для вычисления длины окружности, принимающую радиус.

        double r = 3.14159;
        System.out.println("length = " + (2 + Math.PI * r));

    }
}
