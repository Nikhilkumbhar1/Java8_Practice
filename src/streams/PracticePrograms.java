package streams;

import java.util.*;
import java.util.stream.Collectors;

public class PracticePrograms {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("Nikhil",24,30000.00,"USA"));
        empList.add(new Employee("Dinesh",27,60000.00,"INDIA"));
        empList.add(new Employee("Pranil",35,55000.00,"CHINA"));
        empList.add(new Employee("Suresh",22,28000.00,"INDIA"));
        empList.add(new Employee("Shubham",25,76000.00,"JAPAN"));

        // Write a Program to get MAX salary
        Optional<Employee> empMaxSalary=empList.stream().collect(Collectors.maxBy(Comparator.comparing(t->t.getEmpSalary())));
        System.out.println("Max Salary : " +empMaxSalary.get().getEmpSalary());

        //Write a program to get MIN salary
        Optional<Employee> empMinSal =empList.stream().collect(Collectors.minBy(Comparator.comparing(t->t.getEmpSalary())));
        System.out.println("Minimum Salary : "+ empMinSal.get().getEmpSalary());

        //Write a program to get AVG salary of all employees
        Double avgSal =  empList.stream().collect(Collectors.averagingDouble(e->e.getEmpSalary()));
        System.out.println("Average Salary is:"+ avgSal);

        Map<String,List<Employee>> data= empList.stream().collect(Collectors.groupingBy(e->e.getEmpCountry()));
        System.out.println(data);
    }
}
