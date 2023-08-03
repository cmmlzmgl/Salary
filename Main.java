import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        String surName;
        double salary;
        int workHours;
        int hireYear;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Çalışanın İsmini Giriniz: ");
        name = input.nextLine();

        System.out.print("Lütfen Çalışanın Soyismini Giriniz: ");
        surName = input.nextLine();

        System.out.print("Lütfen Çalışanın Maaşını Giriniz: ");
        salary = input.nextDouble();

        System.out.print("Lütfen Çalışanın Çalışma Saatini Giriniz: ");
        workHours = input.nextInt();

        System.out.print("Lütfen Çalışanın İşe Giriş Yılını Giriniz: ");
        hireYear = input.nextInt();

        Employee employee = new Employee(name, surName, salary, workHours, hireYear);

        employee.printInfo();
    }
}
