package methodreference;

import java.util.function.Supplier;

class Example{

    public Example(){
        System.out.println("Example Constructor...");
    }

}

public class ConstructorReference {
    public static void main(String[] args) {

        //Example e1 = new Example();
        Supplier<Example> s = Example::new;
        System.out.println(s.get().hashCode());
    }

}
