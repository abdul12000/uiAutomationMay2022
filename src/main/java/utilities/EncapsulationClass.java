package utilities;

public class EncapsulationClass {
    // private variables declared here and they can only be accessed by public methods of the class
    private static int randNumbers=0;
    // get method
    public static int getRandNumber() {return randNumbers;}
    // set method
    public static void setRandNumbers(int randNumbers) {EncapsulationClass.randNumbers= randNumbers; }
}
