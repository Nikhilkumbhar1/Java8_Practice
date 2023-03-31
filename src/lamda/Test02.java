package lamda;

interface interf1{
    public void add(int a, int b);
}
public class Test02 {
    public static void main(String[] args) {
        interf1 i1 = (a,b)-> System.out.println("Addition is "+(a+b));
        i1.add(10,20);
        i1.add(100,200);
    }
}
