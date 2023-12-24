public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int thisYear = 2021;
    Employee employee;
    int extraHours = 0;
    int bonusSalary;
    double newSalary;
    double tax;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        if(salary > 1000){
            tax = ( salary * 0.03);
            return salary -= tax;
        }
        return tax;
    }

    double raiseSalary(Employee employee){
        if(thisYear - employee.hireYear < 10){
            return newSalary = employee.salary + (employee.salary * 0.05);
        }else if(thisYear - employee.hireYear > 9 && thisYear - employee.hireYear < 20){
            return newSalary = employee.salary + (employee.salary * 0.1);
        }else {
            return newSalary = employee.salary + (employee.salary * 0.15);
        }
    }

    void infoToString(Employee employee){
        System.out.println("Adı: " + employee.name);
        System.out.println("Maaşı: " + employee.salary);
        System.out.println("Çalışma saati: " + employee.workHours);
        System.out.println("Başlangıç yılı: " + employee.hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonusSalary);
        System.out.println("Maaş artışı: " + (newSalary - salary));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (salary + bonusSalary - tax));
        System.out.println("Toplam maaş: " + newSalary);
    }
    double bonus(){
        if(workHours > 40) {
            extraHours = workHours - 40;
            bonusSalary = extraHours * 30;
        }
        return salary += bonusSalary;
    }
}
