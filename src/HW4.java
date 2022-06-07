public class HW4 {
    public static double formatDouble(double number, int d) {
        int num = (int) Math.round(number * Math.pow(10, d));
        number = num / Math.pow(10, d);
        return number;
    }

    public static void print10(double start, double end, double step, int d) {
        //+ start < end, step >0
        // - start>end, step <0
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(formatDouble(start, d));
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(formatDouble(start, d));
            }
        } else {
            System.out.println("Ошибка");
        }
    }

    public static void printTask12(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(String.format("%2.Of", Math.pow(2, i)));
        }
    }

    public static void Task12(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println((int) Math.pow(2, i) + " ");
        }
    }

    public static String task13() {
        String result = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        for (int i = 0; i < 10; i++) {
            result = result + i;
            result2 = result2 + i + i;
            result3 = result3 + i + i + i;
            result4 = result4 + i + i + i + i;

        }
        return result + result2 + result3 + result4;
    }

    public static void task16(int n, int m, int l) {
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println(" Все числа четные");

        } else {
            while (l > 0) {
                if (n % 2 != 0) {
                    System.out.println(n + " ");
                    l--;
                }
                n = n + m;
            }
        }
    }

    public static void seq17(int n) {
        int l = n + 5;
        for (; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + "=" + (n + 2));
        }
    }

    public static void seq18(int n, int l) {
        if (n < l) {
            System.out.println("[" + (n) + "]" + "=" + n);
            for (; n < l; n++) {

                System.out.println("[" + (n + 1) + "]" + "=" + (2 * n));

            }
            System.out.println();
        } else {
            System.out.println("Ошибка");
        }
    }

    public static void seq19() {
        int des = 0;
        int ed = 0;
        for (int i = 10; i < 100; i++) {
            des = i / 10;
            ed = i % 10;
            if (des - ed <= 3 && ed - des <= 3) {
                System.out.println(i + " ");
            }
        }
    }

    public static void seq20(double x) {
        if (x > 1.5) {
            System.out.println(2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30);
        } else if (x <= 1.5 && x >= 0) {
            System.out.println(x + 1);
        } else {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        HW3.task(1);
        //1.	Распечатать последовательность чисел от 0 до 9 включительно.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        HW3.task((2));
        // 2.	Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }

        HW3.task((3));
        // 3.	Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        for (int i = 50; i < 56; i += 2) {
            System.out.println(i);
        }

        HW3.task((4));
        // 4.	Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        HW3.task((5));
        // 5.	Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1

        for (double i = 12; i < 13; i += 0.1) {
            System.out.println(String.format("%.1f", i));
        }
        for (int i = 120; i < 131; i += 1) {
            System.out.println(((double) i) / 10);
        }

        HW3.task((6));
        // 6.	Распечатать последовательность четных чисел от 215 до 237 включительно
        // найти первое четное число и от него строить цикл с шагом +2
        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        HW3.task((7));
        // 7.	Распечатать последовательность чисел, кратных 7, в промежутке от 7 искл. до 14 исключительно.
        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            } else {
                System.out.println("Нет чисел, кратных 7");
            }
        }

        HW3.task((8));
        // 8.	Распечатать последовательность, которая начинается с минимального значения типа данных short
        // и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }

        HW3.task((10));
        // 10.	Написать метод, который принимает на вход параметры start,  end, step,
        // и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
        // Точка выхода из цикла - число end.

        print10(15, 0, -1, 2);
        print10(10.5, 20.75, 1.29, 2);

        HW3.task((12));
        // 12.	Напишите метод, кот. принимает целое число n, и выводит все степени числа 2 от 1 до n вкл.
        Task12(5);

        HW3.task((13));
        // 13.	Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
        System.out.println(task13());

        HW3.task((14));
        // 14.	Распечатайте последовательность чисел:
        //0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
        for (int i = 0, j = 1; i > -6 || j <= 5; i--, j++) {
            if (j < 6) {
                System.out.print(i + " ," + j + " ,");
            } else {
                System.out.println(i);
            }
        }

        System.out.print(0);
        for (int y = 1; y < 6; y++) {
            System.out.print("," + y + ", " + (y * -1));
            System.out.println("\n");
        }

        HW3.task((15));
        // 15.	Распечатать последовательность чисел:
        //0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
        for (int i = 0; i <= 25; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i + " ");
            }
        }

        HW3.task((16));
        // 	Написать метод, который принимает параметры n, m, ι, и печатает
        // 	последовательность нечетных чисел начиная с числа n, с шагом m,  длина последовательности  ι.
        task16(10, 21, 3);

        HW3.task((17));
        // 17.	Сгенерируйте и распечатайте последовательность по формуле:
        //n + 1 = n + 2
        seq17(1);

        HW3.task((18));
        // 	Написать метод, который принимает параметры ι, n, и печатает последовательность чисел, начиная с числа n, по формуле для n + 1 члена последовательности:
        //n + 1 = 2n
        //Длина последовательности  ι.
        seq18(1, 10);

        HW3.task((19));
        // 19.	Сгенерируйте последовательность целых положительных  двузначных чисел,
        // в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
        seq19();

    }
}
