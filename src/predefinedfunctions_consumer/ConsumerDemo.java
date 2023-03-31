package predefinedfunctions_consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> c= (name)-> System.out.println(name +" Good Morning");
        c.accept("Nikhil");
        c.accept("Rohit");

    }
}
