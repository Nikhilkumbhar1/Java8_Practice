package lamda;

public class Test05_Runnable {
    public static void main(String[] args) {

        Runnable r = ()-> {
          for (int i=1;i<=50;i++){
              System.out.println("Child Thread:" + i);
          }
        };
        Thread t = new Thread(r);
        t.start();

        for (int i=1;i<=50;i++){
            System.out.println("Main Thread:" + i);
        }
    }
}
