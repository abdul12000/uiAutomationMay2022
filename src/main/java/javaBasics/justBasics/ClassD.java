package javaBasics.justBasics;

public class ClassD {

    public int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }
    private int mutliplicationMethod(int x, int y){
        return (x * y);
    }
    private int additionMethod(int x, int y){
        return (x + y);
    }
    private int subtractionMethod(int x, int y){
        return (x - y);
    }
    private int divisionMethod(int x, int y){
        return (x / y);
    }
    public static void main(String[] args) {
        ClassD classd = new ClassD();
        System.out.println(classd.max(5, 6));
        System.out.println(classd.subtractionMethod(100, 50));
        System.out.println(classd.divisionMethod(100, 20));
        System.out.println(classd.divisionMethod(1000, 2));
        System.out.println(classd.mutliplicationMethod(20,1));
        System.out.println(classd.additionMethod(30,3));

    }
}
