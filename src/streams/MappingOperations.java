package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class MappingOperations {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("india","usa","uk","japan");

        names.stream().map(name->name.toUpperCase()).forEach(p-> System.out.println(p));

        names.stream().mapToInt(name ->name.length()).forEach(n-> System.out.println(n));

        List<String> names1 = Arrays.asList("Ashok","Anil","Raju","Rani","John","Akash","Charles");

        //Filter with map
        //Print name with its length which are starting with character A using stream
        System.out.println("-------------------------------------------------------------------------------");
        names1.stream()
                .filter(name ->name.startsWith("A"))
                .map(name->name +"-" +name.length())
                .forEach(name-> System.out.println(name));

        //Get Employee name and age whose salary is >=50,000

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("Nikhil",24,30000.00,"USA"));
        empList.add(new Employee("Dinesh",27,60000.00,"INDIA"));
        empList.add(new Employee("Pranil",35,55000.00,"CANADA"));
        empList.add(new Employee("Suresh",22,28000.00,"USA"));
        empList.add(new Employee("Shubham",25,76000.00,"INDIA"));

        empList.stream()
                .filter(emp->emp.getEmpSalary()>50000)
                .map(emp->emp.getEmpName()+ " "+emp.getEmpAge())
                .forEach(emp-> System.out.println(emp));

        System.out.println("------------------------------------------------");
        empList.stream()
                .filter(emp->emp.getEmpSalary()>50000)
                .forEach(emp-> System.out.println(emp.getEmpName()+" "+emp.getEmpAge()));
    }

}
