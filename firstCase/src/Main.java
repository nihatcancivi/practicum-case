public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Nihat Can Çivi", 5000, 43, 5);
        EmployeeManager manager = new EmployeeManager();
        int taxValue = manager.tax(employee.getSalary(), true);
        int bonusValue = manager.bonus(employee.getSalary(), employee.getWorkHours(), true);
        int raiseSalaryValue = manager.raiseSalary(employee.getSalary(), employee.getHireYear(), true);
        int bonus = manager.bonus(employee.getSalary(), employee.getWorkHours(), false);
        int bonusAndTaxSalary = manager.tax(bonus, false);
        int raiseSalary = manager.raiseSalary(bonusAndTaxSalary, employee.getHireYear(), false);

        manager.toString(
                employee.getName(),
                employee.getSalary(),
                employee.getWorkHours(),
                employee.getHireYear(),
                taxValue,
                bonusValue,
                raiseSalaryValue,
                bonusAndTaxSalary,
                raiseSalary
        );

    }
}