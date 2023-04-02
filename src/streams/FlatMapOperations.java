package streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapOperations {

    public static void main(String[] args) {
        List<String> javaCourses = Arrays.asList("core java","adv java","spring boot");
        List<String> uiCourses = Arrays.asList("html","css","bs","js");

        List<List<String>> courses= Arrays.asList(javaCourses,uiCourses);

        //courses.stream().forEach(c-> System.out.println(c));

        courses.stream().flatMap(course->course.stream()).forEach(System.out::println);

        System.out.println("Hello");




    }
}
