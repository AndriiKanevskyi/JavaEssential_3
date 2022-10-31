package exercise_2_Vehicle;
/*
Завдання 3
Використовуючи IntelliJ IDEA, створіть проект.
Потрібно: Створити клас Vehicle.
У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
 Створіть 3 похідних класи Plane, Саг та Ship.
 Для класу Plane має бути визначена висота та кількість пасажирів.
 Для класу Ship – кількість пасажирів та порт приписки.
 Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Ship ship1 = new Ship(100000,40,1994,1200,"London");
         Plane plane1 = new Plane(70000,981.6,201,12000,140);
         Car car1 = new Car(12000,200,2018);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас вітає прогламма для виводу інформаціі о транспортних засобах!");
        System.out.println("Якщо хочете отримати інформацію про кобарль впишіть 1");
        System.out.println("Якщо хочете отримати інформацію про літак впишіть 2");
        System.out.println("Якщо хочете отримати інформацію про авто впишіть 3");
        int anwser =scanner.nextInt();

    switch (anwser){
        case 1:shipInfo(ship1);
        break;
        case 2: planeInfo(plane1);
        break;
        case 3: carInfo(car1);
        break;
        default:
            System.out.println("Некоретний ввід");
    }

    }




    public static void shipInfo(Ship ship){
        System.out.println("Ціна корабля :"+ship.price);
        System.out.println("Швидкічсть корабля :"+ship.speed);
        System.out.println("Рік будівництво корабля :"+ship.yearOfBuild);
        System.out.println("Кількість пасажирів на кораблі :"+ship.countOfPassengers);
        System.out.println("Порт приписання корабля :"+ship.homePort);
    }

    public static void planeInfo(Plane plane){
        System.out.println("Ціна літака :"+plane.price);
        System.out.println("Швидкічсть літака :"+plane.speed);
        System.out.println("Рік будівництва літака :"+plane.yearOfBuild);
        System.out.println("Висота польоту літака :"+plane.countOfPassengers);
        System.out.println("Кількість пасажирів на літаці :"+plane.countOfPassengers);
    }
    public static void carInfo(Car car){
        System.out.println("Ціна авто :"+car.price);
        System.out.println("Швидкічсть авто :"+car.speed);
        System.out.println("Рік будівництва авто :"+car.yearOfBuild);

    }

}
