package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MatchingOperations {

    public static void main(String[] args) {

        Person p1 = new Person("John","USA");
        Person p2 = new Person("Steve","Japan");
        Person p3 = new Person("Ashok","India");
        Person p4 = new Person("Ching","China");
        Person p5 = new Person("Kumar","India");

        List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);

        boolean status =persons.stream().anyMatch(person -> person.getpCountry().equals("India"));
        System.out.println("Any Indian Available ? "+ status);

        boolean status2 =persons.stream().anyMatch(person -> person.getpCountry().equals("Canada"));
        System.out.println("Any Canadian Available ? "+ status2);

        boolean status3 = persons.stream().allMatch(p->p.getpCountry().equals("India"));
        System.out.println("In this List All are Indian ?"+status3);

        boolean status4 = persons.stream().noneMatch(p->p.getpCountry().equals("Mexico"));
        System.out.println(status4);

       Optional<Person> indianPerson = persons.stream()
                .filter(person ->person.getpCountry().equals("India")).findFirst();

       if (indianPerson.isPresent()){
           System.out.println(indianPerson.get());
       }

        List<Person> indianPersons = persons.stream()
                .filter(person ->person.getpCountry().equals("India")).collect(Collectors.toList());

        System.out.println(indianPersons);

        //Collect names of persons who are belongs to India and store into names collection
       List<String> indianPersonNames = persons.stream().filter(person->person.getpCountry().equals("India")).map(person -> person.getpName()).collect(Collectors.toList());
        System.out.println("Indian Person Names" + indianPersonNames);

    }
}
