
package practiceCollection;


public class Employee {
    private Integer id;
    private String employeeName;
    private Integer age;
    private SalaryStructure salary;
    private EmployeeAddress addr;

    public Employee(Integer id, String employeeName, Integer age, SalaryStructure salary, EmployeeAddress addr) {
        this.id = id;
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
        this.addr = addr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SalaryStructure getSalary() {
        return salary;
    }

    public void setSalary(SalaryStructure salary) {
        this.salary = salary;
    }

    public EmployeeAddress getAddr() {
        return addr;
    }

    public void setAddr(EmployeeAddress addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Employee Details: " 
                + "\nID : " + id 
                + "\nEmployee Name : " + employeeName 
                + "\nAge :" + age 
                + "\n" + salary
                + "\n" + addr;
    }
    
    
}


class SalaryStructure {
    private double currSalary;
    private double minSalary;
    private double maxSalary;
    private String incrementType;
    private double incrementValue;

    public SalaryStructure(double currSalary, double minSalary, double maxSalary, String incrementType, double incrementValue) {
        this.currSalary = currSalary;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.incrementType = incrementType;
        this.incrementValue = incrementValue;
    }

    public double getCurrSalary() {
        return currSalary;
    }

    public void setCurrSalary(double currSalary) {
        this.currSalary = currSalary;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getIncrementType() {
        return incrementType;
    }

    public void setIncrementType(String incrementType) {
        this.incrementType = incrementType;
    }

    public double getIncrementValue() {
        return incrementValue;
    }

    public void setIncrementValue(double incrementValue) {
        this.incrementValue = incrementValue;
    }

    @Override
    public String toString() {
        return "Salary Details: \n" 
                + "Current Salary: " + currSalary 
                + "\nMinimum Salary: " + minSalary 
                + "\nMaximum Salary: " + maxSalary 
                + "\nIncrement Type: " + incrementType
                + "\nIncrement Value: " + incrementValue;
    }
    
}

class EmployeeAddress{
    private String houseName;
    private Integer houseNo;
    private Integer roadNo;
    private Character block;
    private String location;

    public EmployeeAddress(String houseName, Integer houseNo, Integer roadNo, Character block, String location) {
        this.houseName = houseName;
        this.houseNo = houseNo;
        this.roadNo = roadNo;
        this.block = block;
        this.location = location;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public Integer getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(Integer houseNo) {
        this.houseNo = houseNo;
    }

    public Integer getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(Integer roadNo) {
        this.roadNo = roadNo;
    }

    public Character getBlock() {
        return block;
    }

    public void setBlock(Character block) {
        this.block = block;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee Address : " + houseName + ", " + houseNo + " no house, " + roadNo + " no road, " + block + " Block, " + location + '.';
    }
    
}