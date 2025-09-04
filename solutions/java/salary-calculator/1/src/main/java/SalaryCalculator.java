public class SalaryCalculator {
    double salary = 1.0;
    public double salaryMultiplier(int daysSkipped) {
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.salaryMultiplier() method");
       double deductedSalary = salary - (15.0/100); 
       double result = (daysSkipped >= 5) ? deductedSalary : salary;
        return result;
    }

    public int bonusMultiplier(int productsSold) {
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusMultiplier() method");
        return (productsSold >= 20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductsSold() method");
        int multiplier = bonusMultiplier(productsSold);
        return multiplier * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        int baseSalary = 1000;
        double totalSalary = (baseSalary * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        return totalSalary >= 2000 ? 2000 : totalSalary;
        // throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
    } 
}
