package lamda;
import java.util.ArrayList;
import java.util.Collections;

public class Test06_Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(10);
        al.add(40);
        al.add(60);
        al.add(30);
        al.add(20);
        al.add(50);

        System.out.println(al);

        Collections.sort(al,(a, b)->{
            if(a>b) {
                return -1;
            }else if(a<b) {
                return 1;
            }else {
                return 0;
            }
        });

        System.out.println(al);
    }
}

