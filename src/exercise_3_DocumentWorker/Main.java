package exercise_3_DocumentWorker;
import java.util.Scanner;

// Ключ до про-версії 6666
// Ключ до експер- версії 7777

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть свій ключ доступу");
        int userKey = scanner.nextInt();


        if (userKey==ExpertDocumentWorker.getExpKey()){
            System.out.println(" Отримано доступ до Експер-версії\n");
         ExpertDocumentWorker expAvalible = new ExpertDocumentWorker();
         expAvalible.openDocument();
         expAvalible.editDocument();
         expAvalible.saveDocument();
        } else if (userKey==ProDocumentWorker.getProKey()) {
            System.out.println(" Отримано доступ до Про-версії\n");
            ProDocumentWorker proAvalible = new ProDocumentWorker();
            proAvalible.openDocument();
            proAvalible.editDocument();
            proAvalible.saveDocument();
        } else  {
            System.out.println("Такого ключа не знайдено. Ви отримуєте доступ до безкоштовної версії\n");
            DocumentWorker freeAvalible = new DocumentWorker();
            freeAvalible.openDocument();
            freeAvalible.editDocument();
            freeAvalible.saveDocument();

        }


    }
}
