package lamda;

interface interf4 {
  public int squareIt(Integer x);
}

public class Test04 {
    public static void main(String[] args) {

        interf4 i4 = x -> x*x;

        Integer Square =i4.squareIt(10);
        System.out.println("Square is "+ Square);

    }
}
