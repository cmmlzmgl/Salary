public class Employee {
    String name;
    String surName;
    double salary;
    int workHours;
    int hireYear;

    Employee(String _name, String _surName, double _salary, int _workHours, int _hireYear)
    {
        this.hireYear = _hireYear;
        this.name = _name;
        this.salary = _salary;
        this.surName = _surName;
        this.workHours = _workHours;
    }

    public double calculateTax(double salary)
    {
        double tax = 0;
        if (salary > 1000)
        {
            tax = (salary / 100)*3;
        }
        return tax;
    }

    public int calculateBonus(int workHours)
    {
        int bonus = 0;
        if(workHours > 40)
        {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    public double raisedSalary(double salary, int hireYear)
    {
        int workLength = 2021 - hireYear;
        double raisedSalary;

        if (workLength < 10)
        {
            raisedSalary = ((salary / 100) * 5);
        } else if (salary > 10 && salary < 19)
        {
            raisedSalary = ((salary / 100) * 10);
        } else
        {
            raisedSalary = ((salary / 100) * 15);
        }

        return raisedSalary;
    }

    public void printInfo()
    {
        System.out.println("===========================================");
        System.out.println("Çalışanın Adı - Soyadı\t: "+ this.name + " " + this.surName);
        System.out.println("Çalışanın Maaşı\t: "+ this.salary);
        System.out.println("Çalışma Saati\t: "+ this.workHours);
        System.out.println("İşe Başlangıç Yılı\t: "+ this.hireYear);
        System.out.println("Çalışana Ait Vergi\t: " + calculateTax(this.salary));
        System.out.println("Çalışanın Bonusu\t: " + calculateBonus(this.workHours));
        System.out.println("Maaş Artışı\t: " + raisedSalary(this.salary,this.hireYear));
        System.out.println("Vergi ve Bonuslar ile Maaş\t: " + (this.salary + calculateBonus(this.workHours) - calculateTax(this.salary)));
        System.out.println("Toplam Maaş\t: " + (this.salary + calculateBonus(this.workHours) - calculateTax(this.salary) + raisedSalary(this.salary,this.hireYear)));
        System.out.println("===========================================");
    }
}
