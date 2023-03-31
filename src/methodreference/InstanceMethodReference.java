package methodreference;

public class InstanceMethodReference {
    public void m1(){
        for (int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        InstanceMethodReference imr = new InstanceMethodReference();
        Runnable r =imr::m1;
        Thread t = new Thread(r);
        t.start();
    }
}
