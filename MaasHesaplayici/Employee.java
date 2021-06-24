package MaasHesaplayici;

public class Employee {

    String name;
    int salary, workHours, hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double vergi = 0.0;
        if (this.salary < 1000) {
            System.out.println("Vergi uygulanmayacak.");
        } else {
            vergi = this.salary * 0.03;
        }
        return vergi;
    }

    int bonus() {
        int bonus = this.workHours * 30;
        return bonus;
    }

    double raiseSalary() {
        int yil = 2021 - this.hireYear;
        double zam = 0.0;
        if (yil < 10) {
            zam = this.salary * 0.05;
        } else if (yil > 9 && yil < 20) {
            zam = this.salary * 0.10;
        } else if (yil > 19) {
            zam = this.salary * 0.15;
        }
        return zam;
    }

    double genelMaas() {
        double maas = this.salary - tax() + bonus();
        return maas;
    }

    double toplamMaas() {
        double toplam = this.salary + raiseSalary();
        return toplam;
    }

    public String toString() {
        return "Adı: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Saati: " + this.workHours
                + "\nBaşlangıç Yılı: " + this.hireYear + "\nVergi: " + this.tax() + "\nBonus: " + this.bonus()
                + "\nMaaş Artışı: " + this.raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş: " + genelMaas()
                + "\nToplam Maaş: " + toplamMaas();
    }
}
