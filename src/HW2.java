public class HW2 {


    public static int tasknumber;

    public static void task() {
        String line1 = "_________________________________________";
        System.out.println(line1);
        System.out.println("         Task  " + tasknumber + "             ");
        tasknumber++;
        System.out.println(line1);

    }

    public static String checkAge(int age) {
        String you = " ";
        boolean study = age >= 5;
        boolean drive = age >= 16;
        boolean vote = age >= 18;
        if (study) {
            you = "Вы можете ходить в школу \n";
            System.out.println("Вы можете ходить в школу \n");
        }
        if (drive) {
            you = you + "Вы можете водить машину \n";
            System.out.println("Вы можете водить машину \n");
        }
        if (vote) {
            you = you + "Вы можете голосовать \n";
            System.out.println("Вы можете голосовать \n");
        }
        if (age < 5) {
            you = "Слишком мал";
            System.out.println("Слишком мал");
        }
        return "Вам: " + age + "\n" + you;
    }

    public static String subTask(char c) {
        String s = "c";
        return s;

    }


    public static String decApples(int appleCount) {
        int appleLastNumber = appleCount % 10; // Находим на какое число заканчивается наше число
        String apples = ""; //Пустая строка для записи
        boolean appleExclusion = (appleCount % 100 >= 11) && (appleCount % 100 <= 14); // Переменна для исключений между 11 и 14
        if (appleLastNumber == 1) { // Если окончание 1: одно яблоко
            apples = "яблоко";
        } else if (appleLastNumber == 0 || appleLastNumber >= 5) {// Если окончание 0 или больше или равно 5: ноль яблок, пять яблок
            apples = "яблок";
        } else if (appleLastNumber >= 2) { // Если окончание от 2 до 5 ти: два яблока, три яблока
            apples = "яблока";
        }
        if (appleExclusion) { // Если исключение: 11 яблок, 12 яблок, 13 яблок, 14 яблок.
            apples = "яблок";
        }
        return apples;
    }

    public static String decStudents(int studentCount) {
        int studentLastNumber = studentCount % 10;
        boolean studentExclusion = (studentCount % 100 >= 11) && (studentCount % 100 <= 14);
        String students = "";
        if (studentLastNumber == 1) {
            students = "ученика";
        } else if (studentLastNumber == 0 || studentLastNumber >= 5) {
            students = "учеников";
        } else if (studentLastNumber >= 2) {
            students = "ученика";
        }
        if (studentExclusion) {
            students = "учеников";
        }
        return students;
    }

    public static void countApples(int numOfApples, int numOfStudents) {
        System.out.println("Если " + numOfApples + " " + decApples(numOfApples) + " поделить на " + numOfStudents + " "
                + decStudents(numOfStudents) + ", то каждый ученик получит " + (numOfApples / numOfStudents) + " "
                + decApples(numOfApples / numOfStudents) + ", и " + (numOfApples % numOfStudents) + " "
                + decApples(numOfApples % numOfStudents) + " останется учителю.");
    }

    public static void print(int firstNum, int secondNum, String x, String y) {
        int devResult1 = firstNum / secondNum;
        int devResult2 = firstNum % secondNum;
        System.out.println("Результат деления " + x + " на " + y + " = " + devResult1
                + " , a остаток от деления = " + devResult2);

    }

    public static void apple(int apple, int student) {
        System.out.println("Если " + apple + " яблок (а) поделить на  " + student
                + " учеников, то каждый ученик получит по " + (apple / student) + " яблок(a) и " + (apple % student)
                + " яблока(а)  останется учителю .");
    }

    public static double tempF;

    public static void makeT(double tempC) {
        tempF = tempC * 1.8 + 32;
        System.out.println("Результат температуры в Цельсиях " + tempC
                + " и в Фаренгейтах " + tempF);
    }

    public static double getPow(int i) {
        double a2 = 2;
        a2 = Math.pow(i, a2);
        return a2;
    }

    public static void testIntResult(int expectResult, int actualResult) {
        if (expectResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass");

        } else {
            System.out.println("\u001B[31m" + "Fail");
        }
    }

    public static void testStrResult(String expectResult, String actualResult) {
        if (expectResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass");

        } else {
            System.out.println("\u001B[31m" + "Fail");
        }
    }


    public static void main(String[] args) {

        task();
        //Водительские права можно получить, только когда исполнится 16 лет
        int limit = 16;
        int age = 20;
        if (age > limit) {
            System.out.println("Водительские права можно получить");
        } else {
            System.out.println("Водительские права нельзя получить");
        }


        task();
        //○	Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
        //○	Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
        String land = "сухая";
        if (land == "сухая") {
            System.out.println("Нет дождя");
        } else if (land == "мокрая") {
            System.out.println("Идет дождь");
        } else {
            System.out.println("Идет снег");
        }


        task();
        //Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        //Выведите результат работы алгоритма на печать.

        int b7 = 10;
        if (b7 % 2 == 0) {
            System.out.println(b7 = b7 * 2);
        } else {
            System.out.println(b7 = b7 * b7);
        }

        task();
        // 11.	Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        //a)	Голосовать можно с 18 лет
        //b)	Машину можно водить с 16 лет
        //c)	В школу можно идти с 5 лет
        int age1 = 12;
        if (age1 >= 18) {
            System.out.println("Голосовать можно");
        } else {
            System.out.println("Голосовать нельзя");
        }
        if (age1 >= 16) {
            System.out.println("Машину можно водить");
        } else {
            System.out.println("Машину нельзя водить");
        }

        if ((age1 >= 5) && (age1 <= 20)) {
            System.out.println("В школу можно идти");
        } else {
            System.out.println("В школу нельзя идти");
        }

        task();
        //*12.	Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
        //a)	5 - выдать похвальную грамоту и перевести в следующий класс
        //b)	4 - перевести в следующий класс
        //c)	3 - дать задание на лето и перевести в следующий класс
        //d)	2 - вызвать родителей и оставить в текущем классе на второй год*/
        int grade = 5;
        if (grade > 5 || grade < 2) {
        }
        if (grade == 5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс");
        } else if (grade == 4) {
            System.out.println("перевести в следующий класс");
        } else if (grade == 3) {
            System.out.println("дать задание на лето и перевести в следующий класс");
        } else if (grade == 2) {
            System.out.println("вызвать родителей и оставить в текущем классе на второй год");
        }

        task();
        //*14.	Распечатать следующие выражения, используя метод и параметры:
        //Результат деления k на l = …, а остаток от деления  = …
        //Результат деления k на m = …, а остаток от деления  = …
        //Результат деления l на m = …, а остаток от деления  = …
        //Результат деления m на k = …, а остаток от деления  = …
        //И так далее все возможные варианты.*/
        print(10, 20, "k", "l");

        task();
        apple(40, 6);
        apple(100, 21);


        task();
        countApples(42, 42);
        countApples(55, 5);
        countApples(1, 2);

        task();
        //17.	Напишите метод, который примет на вход параметр температуры в Цельсиях,
        // и распечатает результат температуры в Цельсиях и в Фаренгейтах.
        makeT(10);

        task();
        //19.Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        // Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
        // Тестовые данные - 2, 5, 0.
        int b8 = 0;
        int expectedResult = 0;
        if (b8 % 2 == 0) {
            System.out.println(b8 = b8 * 2);
        } else {
            System.out.println(b8 = b8 * b8);
        }
        //Test
        if (expectedResult == b8) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
        testIntResult(4, 2);
        testIntResult(25, 5);
        testIntResult(0, 0);
        task();
        //11.	Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        //a)	Голосовать можно с 18 лет
        //b)	Машину можно водить с 16 лет
        //c)	В школу можно идти с 5 лет
        //20.	Напишите тест, который валидирует ваш код из задания №11.
        checkAge(18);
        String actualResult = "";
        String age18 = "Можно идти в школу, можно водить машину, можно голосовать.";
        String age16 = "Можно идти в школу, можно водить машину.";
        String age5 = "Можно идти в школу.";
        String age0 = "Вам никуда нельзя.";
        int x = 18;
        String expectedResult2 = age18;
        if (x < 5) {
            actualResult = age0;
        } else if (x < 16) {
            actualResult = age5;
        } else if (x < 18) {
            actualResult = age16;
        } else if (x >= 18) {
            actualResult = age18;
        }
        System.out.println("Возраст " + x + " лет.\n" + "Actual result: " + actualResult);
        System.out.println("Expected Result: " + expectedResult2);
        // TEST
        if (expectedResult2.equals(actualResult)) {
            System.out.println("\u001B[32m" + "PASS");
        } else {
            System.out.println("\u001B[31m" + "FAIL");
        }


        task();
        //21.	Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
        // и выводит результат проверки.( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
        short e = -1555;
        if (e <= Short.MAX_VALUE && e >= Short.MIN_VALUE) {
            if (e > -10 && e < 10) {
                System.out.println("Это однозначное число");
            } else if (e >= 10 && e < 100 || e <= -10 && e > -100) {
                System.out.println("Это двузначное число");
            } else if (e >= 100 && e < 1000 || e <= -100 && e > -1000) {
                System.out.println("Это трехзначное число");
            } else if (e >= 1000 && e < 10000 || e <= -1000 && e > -10000) {
                System.out.println("Это четырехзначное число");
            } else if (e >= 10000 && e < 32767 || e <= -10000 && e >= -32768) {
                System.out.println("Это пятизначное число");
            }
        } else {
            System.out.println("Ошибка");
        }


    }


}

































