package predefinedfunctions_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> p = i -> i > 10;
        System.out.println(p.test(5));
        System.out.println(p.test(15));


        //Declare names in an Array print names which are starting with 'A' using lamda expression
        String[] names={"Anushka","Anupama","Deepika","Kajol","Sunny"};

        Predicate<String> p1 = name ->name.startsWith("A");

        for(String name:names){
            if(p1.test(name)){
                System.out.println(name);
            }
        }
        System.out.println("------------------------------------------------------");
        // Take list of persons and print whose age is >=18 using Lamda Expression

        List<Person> persons= new ArrayList<Person>();

        persons.add(new Person("Ramesh",26));
        persons.add(new Person("Rohit",17));
        persons.add(new Person("Dinesh",24));
        persons.add(new Person("Pranil",16));


        Predicate<Person> p3= person -> person.getpAge()>=18;

        for(Person person:persons){
            if(p3.test(person)){
                System.out.println(person.getpName());
            }
        }
        System.out.println("------------------------------------------------------");


        //Print Emp names who are working in Hyd location in DB team
        List<Employee> employee= new ArrayList<Employee>();

        employee.add(new Employee("Raju","Chennai","Devops"));
        employee.add(new Employee("Rani","Pune","Networking"));
        employee.add(new Employee("Ashok","Hyd","DB"));
        employee.add(new Employee("Ganesh","Hyd","Testing"));

        Predicate<Employee> p4= e->e.geteLocation().equals("Hyd");
        Predicate<Employee> p5 = e1-> e1.geteDept().equals("DB");

        //Predicate Joining
        Predicate<Employee> p6= p4.and(p5);

        for(Employee emp:employee){
            if (p6.test(emp)){
                System.out.println(emp.geteName());
            }
        }
    }
}
