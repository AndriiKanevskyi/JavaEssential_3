package exercise_1_ClassRoom;
/*
Створити клас, який представляє навчальний клас ClassRoom.
Створіть клас учень Pupil.
У тілі класу створіть методи void study(), void read(), void write(), void relax().
Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil
і перевизначте кожен із методів, залежно від успішності учня.
Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів.
Передбачте можливість, що користувач може передати 2 або 3 аргументи.
Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BadPupil bad = new BadPupil();
        Pupil standardPupil = new Pupil();
        ExcelentPupil exPupil = new ExcelentPupil();
        GoodPupil goodPupil = new GoodPupil();
        System.out.println("--------------------------------------------");
        System.out.println("Скільки учнів ви хочете додати до классу ?(мінімум 2 максимум 4)");


        Scanner scanner = new Scanner(System.in);
        int howManyPupils = scanner.nextInt();

        while (howManyPupils<2||howManyPupils>4){
            System.out.println("Введіть число більше 2 і меньше 5");
            howManyPupils = scanner.nextInt();
        }
        System.out.println("--------------------------------------------");
        if (howManyPupils==4){ClassRoom cr = new ClassRoom(bad,standardPupil,goodPupil,exPupil);}
        if (howManyPupils==3){ClassRoom cr = new ClassRoom(bad,standardPupil,goodPupil);}
        if (howManyPupils==2){ClassRoom cr = new ClassRoom(bad,standardPupil);}




    }
}
