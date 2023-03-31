package streams;

public class Employee {
    private String empName;
    private Integer empAge;
    private Double empSalary;

    private String empCountry;

    public Employee(String empName, Integer empAge, Double empSalary,String empCountry) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
        this.empCountry=empCountry;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpCountry() {
        return empCountry;
    }

    public void setEmpCountry(String empCountry) {
        this.empCountry = empCountry;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empSalary=" + empSalary +
                ", empCountry='" + empCountry + '\'' +
                '}';
    }
}
