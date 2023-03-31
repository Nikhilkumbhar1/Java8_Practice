package lamda;

interface interf{
    public void m1();
}
public class Test01 {
    public static void main(String[] args) {
        interf i1 = ()-> System.out.println("Hello Nikhil");
        i1.m1();
    }
}
