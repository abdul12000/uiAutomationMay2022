package javaBasics.justBasics;

public class ClassG_Switch1 {
    
    public static String getMonthName(int monthNumber){

        switch (monthNumber){
            case 1:
                return("January");
            case 2:
                return("February");
            case 3:
                return("March");
            case 4:
                return("April");
            case 5:
                return("May");
            case 6:
                return("June");
            case 7:
                return("July");
            case 8:
                return("August");
            case 9:
                return("September");
            case 10:
                return("October");
            case 11:
                return("November");
            case 12:
                return("December");
            default:
                return("Please enter value between 1 and 12");
        }
    }
    public static void main(String[] args) {
        System.out.println(ClassG_Switch1.getMonthName(2));
    }
}
