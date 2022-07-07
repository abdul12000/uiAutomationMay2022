package javaBasics.justBasics;

public class ClassB {

    /*
    We are learning
    java basics
    Short cut to format your code Ctrl+Alt+L
     */
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x");
        System.out.println(x);

        int sumA = 10 + 20;
        System.out.println("sumA : " + sumA);

        int sumB = sumA + 30;
        System.out.println("sumB: " + sumB);

        int a = 5;
        int b = 20;

        //subtraction
        System.out.println(b - a);
        int c = b - a;
        System.out.println(c);

        //multiplication
        int d = a * b;
        System.out.println("multiplication answer : " + d);

        //division
        int e = b / a;
        System.out.println("division answer : " + e);

        //Modulo
//        int s, t;
//        s= 3;
//        t =20;
        int s = 3;
        int t = 20;

        int f = t % s;
        System.out.println("modulo answer : " + f);


        //increment
        int inc = 30;
        System.out.println(inc);
        int incPlus = inc++;
        int newInc = inc;
        System.out.println(newInc);

        //decrement
        int dec = 20;
        System.out.println(dec);
        int decMinus = dec--;
        int newDec = dec;
        System.out.println(newDec);

    }
}
