import java.util.Arrays;

public class HW5 {
    public static int task18(int[] arr) {
        String text1 = "Средний возраст котов из заданного массива = ";
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int averageAge = sum / arr.length;
        return averageAge;
    }

    public static int[] task21(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int average;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(min, array[i]);
            sum += array[i];
        }
        average = sum / array.length;
        int[] arr = {min, max, average};

        return arr;

    }

    public static void print(String[] array) {
        String s = ",";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + s);
        }
    }

    public static void print1(int[] array) {
        String s = ",";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + s);
        }
    }

    public static int avValue(int[] array) {
        double avValue = 0;
        for (int i = 0; i < array.length; i++) {
            avValue += array[i];
        }
        avValue = avValue / array.length;
        return (int) avValue;
    }

    public static int[] getMinMaxAverage(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        int average;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        average = sum / array.length;
        int[] result = new int[3];
        result[0] = min;
        result[1] = max;
        result[2] = average;
        return result;
    }

    public static int randomInt(int upper, int lower) {
        return (int) (Math.random() * (upper - lower)) + lower;
    }


    public static void main(String[] args) {

        HW3.task((1));
        //1.	Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
        String[] catsNames = {"Мурзик", "Барсик", "Мейсон", "Леопольд", "Себастьян", "Милорд", "Мартин", "Томас"};
        for (int i = 0; i < catsNames.length; i++) {
            System.out.println(catsNames[i]);
        }
        HW3.task((2));
        // 2.	В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
        // а значение элемента с индексом 1 на “Черныш”.
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";
        for (int i = 0; i < catsNames.length; i++) {
            System.out.println(catsNames[i]);
        }

        HW3.task((3));
        // 3.	Создать массив catsColors и заполнить его значениями.

        String[] catsColors = {"Белый", "Черный", "Серый", "Рыжий", "Полосатый", "Пепельный", "Дымчатый", "Желтый"};
        System.out.println(Arrays.toString(catsColors));
        HW3.task((4));
        //4.	Создать массив catsAges и заполнить его любыми значениями.
        int[] catsAges = {1, 2, 8, 5, 3, 4, 9, 3};
        System.out.println(Arrays.toString(catsAges));
        print1(catsAges);

        HW3.task((5));
        // 5.	Создать массив isCatRed и заполнить его соответствующими значениями
        boolean[] isCatRed = new boolean[catsColors.length];
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Red")) {
                isCatRed[i] = true;
            } else {
                isCatRed[i] = false;
            }
        }
        System.out.println(Arrays.toString(isCatRed));

        HW3.task((6));
        //6.	Распечатать для массивов catsNames и catsColors:
        //	имя кота в коробке с номером 6
        System.out.println(catsNames[6]);
        System.out.println("_________________________________");
        // имена котов из коробок с четными индексами

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "-" + catsNames[i]);
            }
        }
        System.out.println("_________________________________");
        // имена котов из коробок, чьи индексы кратны 4
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.println(i + "-" + catsNames[i]);
            }
        }
        System.out.println("_________________________________");

        //	цвет котов из коробок с нечетными индексами
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "-" + catsColors[i]);
            }
        }
        System.out.println("_________________________________");
        //цвет котов из коробок, чьи индексы кратны 3
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "-" + catsColors[i]);
            }
        }

        HW3.task((7));
        // 7.	Распечатать “Накорми кота!” для всех серых котов индексы не важны, проверка на 0
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                System.out.println("Накорми кота " + catsNames[i]);
            }
        }
        HW3.task((8));
        // 8.	Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 0 || catsAges[i] > 25) {
                System.out.println("Ошибка");
            } else if (catsAges[i] < 2) {
                System.out.println("Отнеси кота " + catsNames[i] + "а " + "на прививку!");
            }
        }

        HW3.task((9));
        // 9.	Для кота в последней коробке распечатать имя, цвет, возраст
        if ((catsNames.length - 1 == catsColors.length - 1) && (catsNames.length - 1 == catsAges.length - 1)
                && catsNames.length != 0 && catsColors.length != 0 && catsAges.length != 0) {

            System.out.println("кот " + catsNames[catsNames.length - 1]);
            System.out.println("цвет " + catsColors[catsColors.length - 1]);
            System.out.println(catsAges[catsAges.length - 1] + " лет");
        }

        HW3.task((10));
        //10.	Распечатать имена всех котов, чей возраст больше 2 лет
        if ((catsNames.length == catsColors.length) && (catsNames.length == catsAges.length)) {


            for (int i = 0; i < catsAges.length; i++) {
                if (catsAges[i] > 2) {
                    System.out.println(catsNames[i]);
                }
            }
        }

        HW3.task((11));
        //11.	Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        if ((catsNames.length == isCatRed.length) && catsNames.length != 0) {
            for (int i = 0; i < catsNames.length; i++) {
                if (catsNames[i].equals("Рыжик") && isCatRed[i] == true) {
                    System.out.println("Накорми кота " + catsNames[i] + "!");
                }
            }
        }
        HW3.task((12));
        //12.	Распечатать средний возраст котов из массива catsAges
        String text = "Cредний возраст котов из массива = ";
        int sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum = sum + catsAges[i];    //sum += catsAges[i];
        }
        int averageAge = sum / catsAges.length;
        System.out.println(averageAge);

        HW3.task((13));
        // 13.	Распечатать возраст самого молодого кота
        Arrays.sort(catsAges);// сортировка массива по возрастанию
        System.out.println(Arrays.toString(catsAges));
        int minAge = catsAges[0];
        for (int i = 1; i < catsAges.length; i++) {
            if (catsAges[i] < minAge) {
                minAge = catsAges[i];
            }
        }
        System.out.println("Возраст самого молодого кота " + minAge + " год");


        HW3.task((14));
        //14.	Распечатать возраст самого старого кота, не может быть отрицательными
        int maxAge = Integer.MIN_VALUE; // самое маленькое число
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > maxAge) {
                maxAge = catsAges[i];
            }
        }
        System.out.println("Возраст самого старого кота " + maxAge + " лет");


        HW3.task((15));
        //15.	Распечатать количество серых котов
        int greyCat = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                greyCat++;
            }
        }
        System.out.println("Количество серых котов = " + greyCat);

        HW3.task((16));
        // ?16.	Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
        for (int i = 0; i < catsNames.length; i += 2) {
            if (catsAges[i] <= 3) {
                System.out.println(catsNames[i] + " " + catsAges[i]);
            }
        }
        HW3.task((17));
        // 17.	Создать массив четных положительных чисел, значения которых не больше 10.
        // (заполняем значения с помощью цикла for)
        int count = 0;

        for (int i = 0; i <= 10; i += 2) {
            count++;
        }
        int[] array = new int[count];
        int number = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = number;
            number += 2;
        }
        System.out.println(Arrays.toString(array));

        HW3.task((18));
        // 18.	Написать метод, который принимает на вход массив int, и возвращает среднее значение.
        // Проверить работу метода тестом, если параметр - массив catsAges
        print1(catsAges);
        System.out.println(avValue(catsAges));
        HW3.verifyEquals(4, (int) avValue(catsAges));


        HW3.task((19));

        int[] mas = new int[50];
        for (int i = 0, n = 1; i < mas.length; n = n + 2, i++) {
            mas[i] = n;
        }
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }


        HW3.task((20));
        //20.	Создать массив из 10 случайных положительных целых чисел
        int[] randomTen = new int[10];
        for (int i = 0; i < randomTen.length; i++) {
            randomTen[i] = (int) (Math.random() * 10);
            System.out.println(randomTen[i] + " ");

        }

        HW3.task((21));
        // 21.	Создать метод, который принимает на вход массив int,
        // и возвращает минимальное значение, максимальное значение и среднее значение всех чисел массива.
        // Проверить работу метода на массиве из задания 20.
        int[] test = getMinMaxAverage(array);
        int[] test2 = getMinMaxAverage(mas);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < test2.length; i++) {
            System.out.print(test2[i] + " ");
        }
        System.out.println();
        int[] test3 = getMinMaxAverage(catsAges);
        for (int i = 0; i < test3.length; i++) {
            System.out.print(test3[i] + " ");
        }
        System.out.println();

        HW3.task((22));
        // 22.	Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.

        int lengthEven = 0;
        int lengthOdd = 0;
        for (int i = 0; i < randomTen.length; i++) {
            if (randomTen[i] % 2 == 0) {
                lengthEven++;
            } else {
                lengthOdd++;
            }
        }
        int[] even = new int[lengthEven];
        int[] odd = new int[lengthOdd];
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < randomTen.length; i++) {
            if (randomTen[i] % 2 == 0 && countEven < even.length) {
                even[countEven] = randomTen[i];
            } else if (countOdd < odd.length) {
                odd[countOdd] = randomTen[i];
                countOdd++;
            }
        }
        System.out.println();
        print1(even);
        System.out.println();
        print1(odd);


    }
}
