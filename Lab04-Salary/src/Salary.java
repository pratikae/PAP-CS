public class Salary {
    public static void main(String[] args){
        double hourlyRate = 900.00, hoursWorked = 35, overtimeHours = 3;
        double totalSalary = (hoursWorked * hourlyRate) + ((overtimeHours * hourlyRate) * 1.5);
        double taxRate = 0.25, netSalary = totalSalary * (1 - taxRate);
        System.out.println("Hourly rate >>> $" + hourlyRate);
        System.out.println("Regular hours worked >>> " + hoursWorked);
        System.out.println("Overtime hours >>> " + overtimeHours);
        System.out.println();
        System.out.println("Total salary (before taxes) >>> $" + totalSalary);
        System.out.println("Net salary (after taxes) >>> $" + netSalary);





    }
}
