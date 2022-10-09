public class EmployeeManager {
    public int tax(int salary, boolean onlyTaxValue) {
        if (salary < 1000) {
            if (onlyTaxValue) {
                return 0;
            }
            salary = salary;
        } else {
            if (onlyTaxValue) {
                return 3;
            }
            salary = (int) (salary - (salary * 0.03));
        }
        return salary;
    }

    public int bonus(int salary, int workHours, boolean onlyBonusValue) {

        if (workHours > 40) {
            if (onlyBonusValue) {
                return (workHours - 40) * 30;
            }
            salary = salary + ((workHours - 40) * 30);
        } else {
            if (onlyBonusValue) {
                return 0;
            }
            salary = salary;
        }
        return salary;
    }

    public int raiseSalary(int salary, int hireYear, boolean onlyRaiseSalaryValue) {
        int result = 2021 - hireYear;
        if (result < 10) {
            if (onlyRaiseSalaryValue) {
                return 5;
            }
            salary = (int) (salary * 0.05);
        } else if (result > 9 && result < 20) {
            if (onlyRaiseSalaryValue) {
                return 10;
            }
            salary = (int) (salary * 0.10);
        } else {
            if (onlyRaiseSalaryValue) {
                return 19;
            }
            salary = salary + (int) (salary * 0.19);
        }
        return salary;
    }

    public void toString(String name, int salary, int workHours, int hireYear, int taxValue, int bonusValue,
                         int raiseSalaryValue, int bonusAndTaxSalary, int raiseSalary) {
        System.out.println("Ad : " + name);
        System.out.println("Maaş : " + salary);
        System.out.println("Çalışma Saati : " + workHours);
        System.out.println("Başlangıç Yılı : " + hireYear);
        System.out.println("Vergi : %" + taxValue);
        System.out.println("Bonus : " + bonusValue);
        System.out.println("Maaş Artışı : %" + raiseSalaryValue);
        System.out.println("Vergi ve Bonuslarla Birlikte Maaş : " + bonusAndTaxSalary);
        System.out.println("Toplam Maaş : " + raiseSalary);


    }
}
