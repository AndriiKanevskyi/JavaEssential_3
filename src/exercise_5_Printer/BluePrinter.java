package exercise_5_Printer;

public class BluePrinter extends Printer {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    void print(String value){
        System.out.println(ANSI_BLUE+value+ANSI_RESET);
    }
}
