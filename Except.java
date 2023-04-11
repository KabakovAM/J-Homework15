package Homework15;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Except {
    static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println(test1());
        // test2();
        // try {
        // test3();
        // } catch (Exception e) {

        // }
        try {
            System.out.println(test4());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static float test1() {
        float num;
        System.out.println("Введите дробное число:");
        try {
            num = iScanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Ошибка ввода.");
            iScanner.next();
            return test1();
        }
        return num;
    }

    public static void test2() {
        try {
            int d = 0;
            double catchedRes1 = 8 / d;
            System.out.println("catchedRes1 = " + catchedRes1); // Лишняя строка: catchedRes1 никогда не рассчитается.
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void test3() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!"); // Этот метод не может выдать исключение типа
                                                                         // NullPointerException
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { // Throwable это суперкласс всех исключений. Лишнее исключение.
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException { // Этот метод не может выдать
                                                                                     // исключение типа
                                                                                     // FileNotFoundException
        System.out.println(a + b);
    }

    public static String test4() throws Exception{
        String s;
        System.out.println("Введите текст:");
        s = iScanner.nextLine();
        if (s.equals("")){
            throw new Exception("Ввод пустой строки запрещён.");
        }
        return s;
    }
}
