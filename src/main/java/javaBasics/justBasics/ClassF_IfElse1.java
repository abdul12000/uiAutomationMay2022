package javaBasics.justBasics;

public class ClassF_IfElse1 {

    public String DisplayMonthName(int monthNumber) {

        if (monthNumber == 1) {
            return ("January");
        } else if (monthNumber == 2) {
            return ("February");
        } else if (monthNumber == 3) {
            return ("March");
        } else if (monthNumber == 4) {
            return ("April");
        } else if (monthNumber == 5) {
            return ("May");
        } else if (monthNumber == 6) {
            return ("June");
        } else if (monthNumber == 7) {
            return ("July");
        } else if (monthNumber == 8) {
            return ("August");
        } else if (monthNumber == 9) {
            return ("September");
        } else if (monthNumber == 10) {
            return ("October");
        } else if (monthNumber == 11) {
            return ("November");
        } else if (monthNumber == 12) {
            return ("December");
        } else {
            return ("Enter value between 1 and 12");
        }

    }

    public static void main(String[] args) {
        ClassF_IfElse1 classFIfElse1 = new ClassF_IfElse1();
        System.out.println(classFIfElse1.DisplayMonthName(12));

    }
}
