package streams;

import java.util.Arrays;
import java.util.List;

public class SlicingOperations {

    public static void main(String[] args) {
       List<String> javaCourses= Arrays.asList("Core Java","Adv java","Spring Booot","Rest API","Microservices");

       javaCourses.stream().limit(3).forEach(c-> System.out.println(c));

       javaCourses.stream().skip(3).forEach(c-> System.out.println(c));

        List<String> names= Arrays.asList("Raja","Rani","Raja","Rani","Guru");
        names.stream().distinct().forEach(n-> System.out.println(n));
    }
}
