public class RunnableDemo implements Runnable{
    public void run(){
        System.out.println("My Thread is running ");
    }

    public static void main(String[] args) {
          RunnableDemo r=new RunnableDemo();
          Thread t=new Thread(r);
//        t.setName("abc");
        System.out.println(t);
        t.start();
    }
}
