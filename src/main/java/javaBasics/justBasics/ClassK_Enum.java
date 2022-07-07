package javaBasics.justBasics;

public class ClassK_Enum {
    enum PhoneType {
        SAMSUNG,
        IPHONE,
        HTC;
    }

    public static void main(String[] args) {
        System.out.println(PhoneType.IPHONE);   //This will printout “IPHONE”
        System.out.println(PhoneType.HTC);
        System.out.println(PhoneType.SAMSUNG);

    }
}
