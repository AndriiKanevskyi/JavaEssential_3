package exercise_3_DocumentWorker;

public class ProDocumentWorker extends DocumentWorker{
    private static int proKey = 6666;

    public static int getProKey() {
        return proKey;
    }

    public void editDocument(){
        System.out.println("Документ відредаговано");
    }

    public void saveDocument(){
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");

    }
}
