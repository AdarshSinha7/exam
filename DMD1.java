class C1 // program To invoke super class constructor
{
    int i=20;
    void method() {System.out.println(" in C1"+i);}
}
class C2 extends C1
{
    void method()
    {
        System.out.println(" in C2");
    }
}
class C3 extends C1
{
    void method()
    {
        System.out.println(" in C3");
    }
}
class DMD1 {
    public static void main(String a[])
    { C1 obj1=new C1();
        C2 obj2=new C2();
        C3 obj3=new C3();
        C1 ref;
        ref=obj1;
        ref.method();
        ref=obj2;
        ref.method();
        ref=obj3;
        ref.method();
    }
}
