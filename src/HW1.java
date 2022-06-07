public class HW1 {
    public static void main(String[] args) {
        String line1 = "_______________________________________________";
     System.out.println("         Task 1             ");
        System.out.println(line1);
    int number1 = 10;
    int number2 = 10;
    String a5 = "Если number1 = number2, то результат сравнения методом compare = ";

    String a6 = "Если number1 < number2, то результат сравнения методом compare = ";


    String a7 = "Если number1 > number2, то результат сравнения методом compare = ";
        System.out.println(a5 + Integer.compare(number1, number2));
    number1 = 5;
        System.out.println(a6 + Integer.compare(number1, number2));
    number1 = 20;
        System.out.println(a7 + Integer.compare(number1, number2));


        System.out.println("         Task 2             ");
    Float cc = 234.9999F;
        System.out.println(" cc = " + cc.intValue());
        System.out.println(" cc = " + Math.round(cc));
        System.out.println(line1);

        System.out.println("         Task 3             ");
    double a8 = 5.9;
    double a9 = 1.0;
        System.out.println(Double.sum(a8, a9));
        System.out.println(line1);

        System.out.println("         Task 4             ");
    Float a10 = 2.5F;
    Float a11 = 3.5F;
        System.out.println(Integer.sum(a10.intValue(), a11.intValue()));
        System.out.println(line1);

        System.out.println("         Task 5             ");
    Short s1 = 12000;
    Short s2 = 12300;
    String a12 = "12000 - 12300 = ";
        System.out.println(a12 + Short.compare(s1, s2));
        System.out.println(a12 + s1.compareTo(s2));
    String a13 = "12500 - 12300 = ";
    s1 = 12500;
    s2 = 12300;
        System.out.println(a13 + Short.compare(s1, s2));
        System.out.println(line1);

        System.out.println("         Task 6             ");
    String str1 = "123.56";
    String str2 = "123.55";
    Double doub1 = 123.56;
    Double doub2 = 123.55;
    String a14 = "doub1 - doub2 = ";
    String a15 = "str1 - str2";
        System.out.println(a14 + (doub1 - doub2));
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));
        System.out.println(line1);

        System.out.println("         Task 7             ");
        System.out.println(line1);
    Float tCat;
    tCat = 37.3F;
    Float average;
    average = tCat / 2;
    tCat = 35.6F;
    average = average + tCat / 2;
        System.out.println("Среднее значение температуры тела кота - " + Math.round(average));
        System.out.println(line1);

        System.out.println("         Task 8             ");
    Number n = Long.MAX_VALUE;
        System.out.println(n);
    n = 10;
    n = 10.999999999;
        System.out.println(line1);

        System.out.println("         Task 9             ");
    Integer numberInteger = 100;
        System.out.println("Запись numberInteger + 1 ,будет иметь вид: "
                + (numberInteger + 1));
        System.out.println("Запись numberInteger.toString () + 1 ,будет иметь вид: "
                + (numberInteger.toString() + 1));
    // 2 способ
    String numStr = numberInteger.toString();
        System.out.println("Тип numberInteger - это Integer = " + (numberInteger instanceof Integer));
        System.out.println("Тип numberInteger.toString () - это String = " + (numStr instanceof String));
    // 3 способ
        System.out.println(numberInteger.getClass());
        System.out.println(numStr.getClass());
        System.out.println(line1);

}
}
