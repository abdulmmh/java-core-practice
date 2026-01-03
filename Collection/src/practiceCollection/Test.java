
package practiceCollection;


public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "Mahadi Hasan", 26,
                        new SalaryStructure(200000, 150000, 500000, "Normal", 0.5), 
                          new EmployeeAddress("Krishnochura", 14, 8, 'F', "Rampura")); 
        
        System.out.println(e1);
    }
}
