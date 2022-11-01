package exercise_5_Printer;

public class GreenPrinter extends Printer{
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    void print(String value){
        System.out.println(ANSI_GREEN+value+ANSI_RESET);
    }
}
