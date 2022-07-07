package javaBasics.justBasics;

public class ClassJ_Arrays {
    public static void main(String[] args) {
        String[] languages = {"Spanish", "English", "Russian", "Polish", "Portuguese"};

//        System.out.println(languages[5]);
        System.out.println(languages[4]);
        System.out.println(languages[1]);

        //Using traditional for loop to get all the arrays
        for(int i = 0; i < 5; i++){
            System.out.println(languages[i]);
        }
        //using for-each
        for(String t: languages){
            System.out.println(t);
        }
        System.out.println(languages.length);

        // Array of integers 1x1
        int[] myNumber = {5, 10, 15, 20, 25};
        for(int a: myNumber) {
            System.out.println(a);
        }
// 2x2 array
        int[][] myArr = {{1, 2, 3, 4, 5}, {10, 15, 20, 25, 30}};

            System.out.println(myArr[0][0]);
        System.out.println(myArr[0][2]);
        System.out.println(myArr[1][4]);

    }
}
