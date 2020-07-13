package com.lessons.lesson2;

import org.w3c.dom.ls.LSOutput;

/*
2. Написать программу, вычисляющую корни квадратного уравнения
вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли
данные.
        Учитывать только реальные корни (в случае отрицательного
дискриминанта выводить сообщение пользователю).
        При решении создать и использовать следующие вынесенные
функции:
    - функция isPositive, определяющая, является ли число
    положительным
    - функция isZero, определяющая, является ли число нулём
    - функция discriminant, вычисляющая дискриминант
 */
public class HomeWork2 {

    public static void main(String[] args) {

        double x1 = 0, x2 = 0;
        int a = 3;
        int b = 6;
        int c = 3;
        int D = discriminant(a, b, c);
        double value = Math.sqrt(D);

        if (isPositive(D)) {


            x1 = (-b + value) / (2 * a);
            x2 = (-b - value) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (isZero(D)) {

            x1 = -b / (2 * a);
            System.out.println("x = " + x1);

        } else if (D < 0) {

            System.out.println("Уравнение не имеет корней.");
        }

    }

    public static boolean isPositive(int D) {

        return D > 0;

    }

    public static boolean isZero(int D) {

        return D == 0;
    }

    public static int discriminant(int a, int b, int c) {
        int D = b * b - 4 * a * c;
        return D;
    }

}
