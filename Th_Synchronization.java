class Table
{ 
    synchronized static void display(int n) //synchronized method
    { 
        System.out.print("Table of "+n+" :\t");
        for(int i=1;i<=10;i++) 
        { 
            System.out.print("\t"+n*i); 
            try
            { 
                Thread.sleep(5); 
            }
            catch(Exception e) {System.out.println(e.getMessage());} 
        } 
        System.out.println("");
    }//end of the method 
} 
 
class MyThread1 extends Thread
{ 
    Table t; 
    MyThread1(Table t)
    { 
        this.t=t; 
    } 
    public void run()
    { 
        t.display(10); 
    } 
} 
class MyThread2 extends Thread
{ 
    Table t; 
    MyThread2(Table t) 
    { 
        this.t=t; 
    } 
    public void run()
    { 
        t.display(50); 
    } 
} 
class Th_Synchronization 
{ 
    public static void main(String args[])
    { 
        Table obj = new Table(); 
        MyThread1 t1=new MyThread1(obj); 
        MyThread2 t2=new MyThread2(obj); 
        t1.start();
        t2.start(); 
    } 
} 