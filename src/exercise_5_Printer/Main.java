package exercise_5_Printer;

public class Main {
    public static void main(String[] args) {
        String s = "Привіт";

Printer regular = new  Printer();
Printer green = new GreenPrinter();
Printer blue = new BluePrinter();

regular.print(s);
green.print(s);
blue.print(s);

    }
}
