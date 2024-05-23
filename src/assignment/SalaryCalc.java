package assignment;
public class SalaryCalc {
    public static void main(String[] args) {
        double basicSalary = 15000; 
        
        
        double hraPercentage;
        double daPercentage;
        
        
        if (basicSalary <= 10000) {
            hraPercentage = 20;
            daPercentage = 80;
        } else if (basicSalary <= 20000) {
            hraPercentage = 25;
            daPercentage = 90;
        } else {
            hraPercentage = 30;
            daPercentage = 95;
        }
        
        
        double hra = (hraPercentage / 100) * basicSalary;
        double da = (daPercentage / 100) * basicSalary;
        
        
        double totalSalary = basicSalary + hra + da;
        
       
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + totalSalary);
    }
}

