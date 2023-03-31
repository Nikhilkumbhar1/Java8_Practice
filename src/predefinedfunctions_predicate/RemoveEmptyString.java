package predefinedfunctions_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveEmptyString {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Durga");
        names.add(null);
        names.add("Raj");
        names.add("");
        names.add(null);
        names.add("Nikhil");

        Predicate<String> p = s ->s != null && s.length() !=0;
        List<String> names1 = new ArrayList<String>();

        for(String s:names){
            if(p.test(s)){
                names1.add(s);
            }
        }
        System.out.println(names1);
    }
}

