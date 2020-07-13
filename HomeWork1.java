package com.lessons.lesson2;

/*
    1. Имеются три числа - день, месяц и год, вводимые пользователем с
    консоли.
        Вывести дату следующего дня в формате 'День.Месяц.Год'.
        Учесть переход на следующий месяц, а также следующий год.
        Форматирование строки 'День.Месяц.Год' вынести в отдельную
    функцию.
 */

import javax.xml.crypto.Data;

public class HomeWork1 {

    public static void main(String[] args) {
        /*
       Январь, март, май, июль, август, октябрь, декабрь - 31 день
      Апрель, июнь, сентябрь, ноябрь - 30 дней
      Февраль - 28 дней в обычный год, 29 дней в високосный
         */

        int day = 28;
        int month = 2;
        int year = 2000;

        if (year % 4 == 0 && month == 2 && day == 29) {

            day = 1;
            month++;
            Data(day,month,year);

        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && month != 12 && day == 31) {

            day = 1;
            month++;
            Data(day,month,year);

        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {

            day = 1;
            month++;
            Data(day,month,year);

        } else if (month == 12 && day == 31) {

            day = 1;
            month = 1;
            year++;
            Data(day,month,year);

        } else if (year % 4 != 0 && day == 28 && month == 2) {

            day = 1;
            month++;
            Data(day,month,year);

        } else if (day < 29 && month == 2) {

            day++;
            Data(day,month,year);

        } else if (day < 30 && month == 4 || month == 6 || month == 9 || month == 11) {

            day++;
            Data(day,month,year);

        } else if (day < 31 && month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

            day++;
            Data(day,month,year);

        }
    }

    public static void Data(int day, int month, int year){

        System.out.println(day + "." + month + "." + year);
    }
}



