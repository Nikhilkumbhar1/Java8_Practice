package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class FirstDemoFilterOperations {
    public static void main(String[] args) {
        //Approach-1
        Stream<Integer> stream1= Stream.of(1,2,3,4,5);

        ArrayList<String> names =new ArrayList<>();
        names.add("John");
        names.add("Rabert");
        names.add("Orlon");

        //Approach-2
        Stream<String> stream2 = names.stream();

        List<Integer> numbers= new ArrayList<Integer>();
        numbers.add(66);
        numbers.add(32);
        numbers.add(45);
        numbers.add(12);
        numbers.add(20);

        //Find number is greater than 20 by using stream
        numbers.stream().filter(n->n>20) .forEach(n-> System.out.println(n));

       List<String> name = Arrays.asList("John","Anushka","Robert","Anupama","Ajay");

       //Print the names Starts with A letter
       name.stream().filter(n-> n.startsWith("A")).forEach(n-> System.out.println(n));

        User u1 = new User("Anushka",25);
        User u2 = new User("Smith",30);
        User u3 = new User("Raju",15);
        User u4 = new User("Rani",20);
        User u5 = new User("Charles",35);
        User u6 = new User("Ashok",30);

        Stream<User> stream =Stream.of(u1,u2,u3,u4,u5,u6);

        //Print user whose age is greater than 18
        //stream.filter(user->user.getUserAge()>18).forEach(user-> System.out.println(user));

        //Names should start with 'A' and age is greater than 18
        System.out.println("------------------------------------");
        stream.filter(user -> user.getUserName().startsWith("A") && user.getUserAge()>18).forEach(user-> System.out.println(user));
    }
}
