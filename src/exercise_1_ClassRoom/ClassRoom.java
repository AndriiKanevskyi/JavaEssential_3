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
public class ClassRoom {
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        Pupil[] classList = new Pupil[4];

        classList[0] = pupil1;
        classList[1] = pupil2;
        classList[2] = pupil3;
        classList[3] = pupil4;
        for (int i = 0; i < classList.length; i++) {
            classList[i].study();
            classList[i].read();
            classList[i].write();
            classList[i].relax();
            System.out.println("--------------------------------------------");
        }



    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        Pupil[] classList = new Pupil[3];

        classList[0] = pupil1;
        classList[1] = pupil2;
        classList[2] = pupil3;

        for (int i = 0; i < classList.length; i++) {
            classList[i].study();
            classList[i].read();
            classList[i].write();
            classList[i].relax();
            System.out.println("--------------------------------------------");
        }



    }
    public ClassRoom(Pupil pupil1, Pupil pupil2 ) {
        Pupil[] classList = new Pupil[2];

        classList[0] = pupil1;
        classList[1] = pupil2;


        for (int i = 0; i < classList.length; i++) {
            classList[i].study();
            classList[i].read();
            classList[i].write();
            classList[i].relax();
            System.out.println("--------------------------------------------");
        }



    }

}
