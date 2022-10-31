package exercise_1_ClassRoom;

public class ExcelentPupil extends Pupil {


    public void study(){
        System.out.println("Відмінник вчиться на самі пятірки");
    }

    public void read(){
        System.out.println("Відмінник читає на відмінно");
    }

    public void write(){
        System.out.println("Відмінник пише краще за вчителя");
    }

    public void relax(){
        System.out.println("Відмінник не любить відпочивати, бо в цей час можно завчити наступну тему по алгебрі");
    }

    //Також відмінник має два бонусні методи

    public void memorize(){
        System.out.println("Відмінник завчив правильні відповіді !");
    }
    public void ingratiateUpToTeacher(){
        System.out.println("Відмінник  підлизвася до вчителя !");
    }
    public void rememberToTeacher(){
        System.out.println("Відмінник  пригадав вчителю що він не завдав ДЗ !");
    }
}
