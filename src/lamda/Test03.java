package lamda;

interface interf3{
    public int findLength(String s);
}

public class Test03 {
    public static void main(String[] args) {
        interf3 i3= s -> s.length();

        System.out.println(i3.findLength("Nikhil"));
        System.out.println(i3.findLength("Accion Labs"));
    }
}
