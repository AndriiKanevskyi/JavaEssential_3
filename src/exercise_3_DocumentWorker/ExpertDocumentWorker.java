package exercise_3_DocumentWorker;

public class ExpertDocumentWorker extends ProDocumentWorker{

     private static int expKey = 7777;

    public static int getExpKey() {
        return expKey;
    }

    public void saveDocument(){
        System.out.println("Документ збережений в новому форматі");

    }
}
