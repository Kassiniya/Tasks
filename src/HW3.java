public class HW3 {
    public static void task(int tasknumber) {
        String line1 = "_________________________________________";
        System.out.println(line1);
        System.out.println("         Task  " + tasknumber + "             ");
        tasknumber++;
        System.out.println(line1);

    }

    public static void task10(int a) {
        if (a % 2 == 0) {
            System.out.println(a * 2);
        } else {
            System.out.println(a * a);
        }
    }

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }

    }


    public static String showDay(int a) {
        String b = "";
        if (a >= 1 && a <= 7) {
            if (a == 1) {
                return "Понедельник";
            } else if (a == 2) {
                return "Вторник";
            } else if (a == 3) {
                return "Среда";
            } else if (a == 4) {
                return "Четверг";
            } else if (a == 5) {
                return "Пятница";
            } else if (a == 6) {
                return "Суббота";
            } else if (a == 7) {
                return "Воскресенье";
            } else {
                return "Ошибка";
            }
        }
        return b;
    }

    public static int returnMax(int x, int y, int z) {
        int max;
        max = (Math.max(Math.max(x, y), z));
        return max;
    }

    public static int returnMin(int x, int y, int z) {
        int small;
        if (x > y) {
            small = y;
        } else {
            small = x;
        }
        if (small > z) {
            small = z;
        } else {
        }
        return small;
    }

    public static String showTemp(double a, double b, double c, double d, double e) {

        String result = "";
        double catMax = 40.55;
        double catMin = 35.15;
        if ((a >= catMin) && (a <= catMax) && (b >= catMin) && (b <= catMax) && (c >= catMin) && (c <= catMax)
                && (d >= catMin) && (d <= catMax) && (e >= catMin) && (e <= catMax)) {
            double value = ((a + b + c + d + e) / 5);
            result = String.format("%.2f", value);
        } else {
            result = "Ошибка";
        }
        return result;
    }


    public static void printKg(double weight) {
        int kilo = (int) weight; //10
        double gram = weight - kilo; // 0.75
        double gram1 = gram * 1000; // 750.0
        int gram2 = (int) gram1; // 750
        System.out.println(kilo + " кг. " + gram2 + " гр.");
    }

    public static String purchase(double price, double weight) {
        double rub = price * weight;
        return String.format("%.2f", rub);
    }

    public static String moneyWithCents(double money) {
        String result;
        if (money >= 0) {
            double whole = money;//125.5
            whole = (int) whole;//125
            double cents = (money - whole) * 100;//500
            result = (int) money + " руб " + (int) cents + " коп ";
        } else {
            result = " Ошибка ";
        }
        return result;
    }

    public static String weightKg(double weight) {
        String result;
        if (weight >= 0) {
            Double whole = weight;
            whole = (double) whole.intValue();
            double grams = (weight - whole) * 1000;
            result = (int) weight + " кг. " + (int) grams + " гр. ";
        } else {
            result = "Ошибка";

        }
        return result;

    }

    public static String returnWeight(double yourWeight) {
        int kg = (int) Math.floor(yourWeight);
        int gr = (int) ((yourWeight - kg) * 100);
        return kg + " кг. " + gr + " гр. ";
    }

    static int numberC = 1;

    public static String check() {
        String result;
        result = " " + numberC;
        numberC++;
        return result;
    }

    public static String showKg(String product, double price1, double weight1) {
        String result;
        String line1 = "______________________________________________";
        double payResult = Double.parseDouble(purchase(price1, weight1));
        String finelPayResult = moneyWithCents(payResult);
        result = check() + "\n" + line1 + "\n" + "|  " + product + "                     |" + "\n"
                + "|  Цена за 1 кг.      " + moneyWithCents(price1) + " |" + "\n"
                + "| Количество товара   " + weightKg(weight1) + " |" + "\n" + "|" + line1 + "|" + "\n"
                + "| Сумма к оплате      " + finelPayResult + "   |\n" + "|" + line1 + "|";
        return result;
    }

    public static String countSalary(double worksDayHours, double priceOneHour) {
        int salary = ((int) (worksDayHours * priceOneHour * 21));
        Double salary1 = ((worksDayHours * priceOneHour * 21));
        Integer realSalary = (int) salary;
        int coins = (int) ((salary1 - salary) * 100);
        return (salary + " руб " + coins + " коп ");

    }

    public static String countSalary1(String name, double pay, String name1, double pay1) {
        return (" " + name + "       " + moneyWithCents(pay) + "\n" + name1
                + "      " + moneyWithCents(pay1));
    }

    public static String checkX(int x) {
        if (x < 0) {
            return x + " is negative";
        } else if (x > 0) {
            return x + " is positive";
        } else {
            return x + " is zero";
        }
    }

    public static Integer luckyNumber(int year) {
        int n1 = year / 1000;//1
        int n2 = (year % 1000) / 100;
        int n3 = (year % 100) / 10;
        int n4 = (year % 10);
        int luckyNum = n1 + n2 + n3 + n4;
        while (luckyNum >= 10) {
            n1 = luckyNum / 10;
            n2 = luckyNum % 10;
            luckyNum = n1 + n2;
        }
        return luckyNum;

    }

    public static String customer(double a) {
        int b = (int) Math.floor(a);
        String sum = b + " руб " + (b / 100) + "0  коп";
        //String sum = rubCop(b);

        return sum;
    }

    public static double formula(int a, int b, int c) {
        double result = (Math.sqrt((Math.fma(a, b, c)) * Math.pow(a, b)) / Math.PI);
        //Math.fma (a,b,c) = (a + b) * c
        return Math.ceil(result);
    }

    public static int postOne(int x, int y) {
        if (y > 0) {
            x = 1;
        }
        return x;
    }

    public static double postTwo(double score) {
        if (score >= 80 && score <= 90) {
            score += 5;
        }
        return score;
    }

    public static boolean postT(int i, int v) {
        boolean item = (i >= 10) && (v < 50);
        return (item);
    }

    public static boolean postF(int x) {
        boolean ans = (x > 0) && (x % 2 == 0);
        return ans;
    }

    public static boolean postV(int x, int y) {
        boolean ans = (x > 0 && y > 0) || (x < 0 && y < 0);
        return ans;
    }

    public static double getPow(int pow) {
        if (pow >= 0 && pow <= 10) {
            return Math.round(Math.pow(Math.random(), pow));
        } else
            System.out.println("Ошибка");
        return Double.MIN_VALUE;
    }


    public static double getRandom() {
        int num = (int) (Math.random() * 99) + 1;
        System.out.println(num);
        return num;
    }

    public static boolean leapYear(int year) {
        boolean isLeapYear = (year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 > 0);
        return isLeapYear;
    }


    public static void main(String[] args) {
        task(2);
        //Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
        System.out.println(showDay(5));
        verifyEquals("Понедельник", showDay(1));
        verifyEquals("Ошибка", showDay(0));

        task(3);
        //По трем значениям x, y и z определите наибольшее значение и присвойте это значение самой большой переменной
        System.out.println(returnMax(5, 4, 3));

        verifyEquals(returnMax(5, 10, 15), 15);

        task(4);
        //используя вложенные операторы if, напишите фрагмент кода, который печатает наименьшее значение,
        // содержащееся в переменных a, b и c
        System.out.println(returnMin(5, 4, 3));

        task(5);
        // Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
        System.out.println(showTemp(36, 37, 38, 39, 39.5));


        task(7);
        // Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”
        printKg(0.05);


        System.out.println(purchase(20.5, 5));

        task(10);
        //Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
        // и возвращает заработную плату в месяц.
        System.out.println(countSalary(5, 10));

        task(11);
        /* Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи
         зарплаты сотрудникам.
         Смирнова Мария Ивановна 		70000 руб 00 коп

       Распечатать ведомость для нескольких сотрудников, например:

        Март 2022
       Смирнова Мария Ивановна 		   70000 руб 00 коп
       Серебряков Иван Петрович 		       128059 руб 00 коп*/
        String name = "Смирнова Мария Ивановна";
        double pay = 1200.50;
        String name1 = " Серебряков Иван Петрович";
        double pay1 = 1300.50;
        System.out.println(countSalary1(name, pay, name1, pay1));


        task(12);
        System.out.println(checkX(10));

        task(13);
         /*13.	Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
          Счастливое число рассчитывается по форумуле: сумма всех чисел, если результат больше 9, снова считается сумма
           всех чисел.
       год рождения 1999
       1 + 9 + 9 + 9 = 28
       2 + 8 = 10
       1 + 0 = 1
       Счастливое число - 1*/
        System.out.println(luckyNumber(1988));


        task(15);
        //15.	Написать метод, кот. использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
        // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки  “10 руб 00 коп”.
        System.out.println(customer(50.20));

        task(16);
        System.out.println(formula(1, 2, 3));

        task(17);
        System.out.println(postOne(5, 10));
        System.out.println(postTwo(80));
        System.out.println(postTwo(79));
        System.out.println(postT(11, 60));
        System.out.println(postF(5));
        System.out.println(postV(2, -5));

        task(18);
        System.out.println(getPow(5));

        task(19);
        //Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
        getRandom();
        task(20);
        System.out.println(leapYear(2020));
    }
}
