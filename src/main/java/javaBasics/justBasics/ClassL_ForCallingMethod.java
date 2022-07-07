package javaBasics.justBasics;

public class ClassL_ForCallingMethod {
    public static void main(String[] args) {
        ClassF_IfElse1 classFIfElse1 = new ClassF_IfElse1();
        System.out.println(classFIfElse1.DisplayMonthName(1));

        System.out.println(ClassG_Switch1.getMonthName(7));

        System.out.println(EnumForCars.TOYOTA);
        System.out.println(EnumForCars.LAMBOGINI);
    }
}
