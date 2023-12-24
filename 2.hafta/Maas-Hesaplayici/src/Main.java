public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("hasan",2000,45,1985);
        e1.bonus();
        e1.tax();
        e1.raiseSalary(e1);
        e1.infoToString(e1);
    }
}