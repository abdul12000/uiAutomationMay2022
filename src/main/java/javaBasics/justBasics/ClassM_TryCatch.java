package javaBasics.justBasics;

public class ClassM_TryCatch {
    public static void main(String[] args) {
        String[] languages = {"Spanish", "English", "Russian", "Polish", "Portuguese"};

        try {
            System.out.println(languages[9]);
        } catch (Exception e) {
            System.out.println("Exception being thrwon is : " + e);
        }
        System.out.println(languages[4]);
        System.out.println(languages[1]);

        //Using traditional for loop to get all the arrays
        for (int i = 0; i < 5; i++) {
            System.out.println(languages[i]);
        }
        //using for-each
        for (String t : languages) {
            System.out.println(t);
        }
        System.out.println(languages.length);

        // Array of integers
        int[] myNumber = {5, 10, 15, 20, 25};
        for (int a : myNumber) {
            System.out.println(a);
        }
    }
}
